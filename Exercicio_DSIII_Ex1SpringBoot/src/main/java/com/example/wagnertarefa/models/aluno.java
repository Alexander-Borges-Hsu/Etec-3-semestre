package com.example.wagnertarefa.models;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class aluno {

    @NotNull
    @NotBlank
    private String nome;

    @NotNull(message = "Idade não pode ser nula")
    private Integer idade;

    @NotBlank
    @NotNull
    private String cpf;

    public aluno(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
