package com.psiconnect.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pacientes") //Gera o nome da tabela no banco de dados

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define que o ID será gerado automaticamente pelo banco
    private long id;

    @Column(nullable = false) //Indica que o campo não pode ser nulo
    private String nomeCompleto;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String telefone;

    @Column(nullable = false,unique = true)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private boolean baixaRenda; // Baixa renda? T/F

    @Column(nullable = false)
    private boolean vulneravel; // Está em situação de vulnerabilidade? T/F

    public Paciente(){
    }

    public Paciente(String nomeCompleto, LocalDate dataNascimento, String genero, String email, String telefone, String usuario, String senha, boolean baixaRenda, boolean vulneravel ){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.baixaRenda = baixaRenda;
        this.vulneravel = vulneravel;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public boolean getBaixaRenda(){
        return baixaRenda;
    }
    public void setBaixaRenda(boolean baixaRenda){
        this.baixaRenda = baixaRenda;
    }
    public boolean getVulneravel(){
        return vulneravel;
    }
    public void setVulneravel(boolean vulneravel){
        this.vulneravel = vulneravel;
    }















}
