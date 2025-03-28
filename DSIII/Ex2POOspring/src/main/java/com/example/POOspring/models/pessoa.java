package com.example.POOspring.models;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class pessoa {
    @NotBlank(message = "Nome não pode ser vazio")
    @NotNull(message = "Nome não pode ser nulo")
    private String nome;

    @NotBlank(message = "Sobrenome não pode ser vazio")
    @NotNull(message = "Sobrenome não pode ser nulo")
    private String sobrenome;

    @NotNull(message = "Idade não pode ser nula")
    @Min(0)
    @Max(150)
    private int idade;

    @NotBlank(message = "Email não pode ser vazio")
    @NotNull(message = "Email não pode ser nulo")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "Telefone não pode ser vazio")
    @NotNull(message = "Telefone não pode ser nulo")
    private String telefone;

    @NotBlank(message = "Endereço não pode ser vazio")
    @NotNull(message = "Endereço não pode ser nulo")
    private String endereco;

    @CPF(message = "CPF inválido")
    @NotBlank(message = "CPF não pode ser vazio")
    @NotNull(message = "CPF não pode ser nulo")
    private String cpf;

    public pessoa(String nome, String sobrenome, int idade, String email, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }   

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
