package com.example.POOspring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.POOspring.models.aluno;
import com.example.POOspring.models.pessoa;
import com.example.POOspring.models.professor;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/vi/escola")
public class escolaController {
    public List<pessoa> pessoas = new ArrayList<>();

    @RequestMapping("/listarAlunos")
    public List<aluno> listarAlunos(){
        List<aluno> alunos = new ArrayList<>();
        for(pessoa pessoa : pessoas){
            if(pessoa instanceof aluno){
                alunos.add((aluno) pessoa);
            }
        }
        return alunos;
    } 

    @RequestMapping("/listarProfessores")
    public List<professor> listarProfessores(){
        List<professor> professores = new ArrayList<>();
        for(pessoa pessoa : pessoas){
            if(pessoa instanceof professor){
                professores.add((professor) pessoa);
            }
        }
        return professores;
    }

    @PostMapping("/cadastrarAluno")
    public aluno inserirAluno(@RequestBody @Valid aluno aluno){
        pessoas.add(aluno);
        return aluno;
    }

    @PostMapping("/cadastrarProfessor")
    public professor inserirProfessor(@RequestBody @Valid professor professor){
        pessoas.add(professor);
        return professor;
    }

    @PutMapping("/atualizarAluno")
    public String atualizarAluno(@RequestBody @Valid aluno alunoAtualizado) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof aluno && pessoas.get(i).getCpf().equals(alunoAtualizado.getCpf()) && pessoas.get(i).getIdade() >= 18) {
                pessoas.set(i, alunoAtualizado);
                return "Aluno atualizado com sucesso!";
            }
        }
        return "Aluno não encontrado ou é menor de idade!";
        
    }
}
