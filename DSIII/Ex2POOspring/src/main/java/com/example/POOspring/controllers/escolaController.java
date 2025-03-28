package com.example.POOspring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
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
}
