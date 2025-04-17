package com.psiconnect.entities;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Psicologos")
public class Psicologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(nullable = false,unique = true)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false,unique = true)
    private String crp;

    @Column(nullable = false,length = 300)
    private String bio;

    @Column(nullable = false)
    private boolean presencial;

    @Column(nullable = false)
    private boolean remoto;


    //Como fazer
//    @Column(nullable = false)
//    private boolean ambos;
//    }

    public Psicologo(){

    }

    public Psicologo(String nomeCompleto, LocalDate dataNascimento, String genero, String email,String telefone, String usuario,String senha,String crp,String bio,boolean presencial,boolean remoto){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.crp = crp;
        this.bio = bio;
        this.presencial = presencial;
        this.remoto = remoto;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
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
    public String getCrp(){
        return crp;
    }
    public void setCrp(String crp){
        this.crp = crp;
    }
    public String getBio(){
        return bio;
    }
    public void setBio(String bio){
        this.bio=bio;
    }
    public boolean isPresencial(){
        return presencial;
    }
    public void setPresencial(boolean presencial){
        this.presencial = presencial;
    }
    public boolean isRemoto(){
        return remoto;
    }
    public void setRemoto(boolean remoto){
        this.remoto = remoto;
    }
}
