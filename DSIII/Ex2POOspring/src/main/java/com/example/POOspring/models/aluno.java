package com.example.POOspring.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class aluno extends pessoa {
    @NotBlank(message = "Curso não pode ser vazio")
    @NotNull(message = "Curso não pode ser nulo")
    private String curso;

    public aluno(String nome, String sobrenome, int idade, String email, String telefone, String endereco, String cpf, String curso) {
        super(nome, sobrenome, idade, email, telefone, endereco, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
