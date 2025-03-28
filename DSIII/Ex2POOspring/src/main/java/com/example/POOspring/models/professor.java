package com.example.POOspring.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class professor extends pessoa {
    @NotBlank(message = "Disciplina não pode ser vazia")
    @NotNull(message = "Disciplina não pode ser nula")
    private String disciplina;

    public professor(String nome, String sobrenome, int idade, String email, String telefone, String endereco, String cpf, String disciplina) {
        super(nome, sobrenome, idade, email, telefone, endereco, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
