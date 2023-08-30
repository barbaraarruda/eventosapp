package com.eventosapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Convidado {

    @Id
    
    private String cpf;

   
    private String nomeConvidado;
    private String emailConvidado;
    private String telefoneConvidado;

    @ManyToOne
    private Evento evento;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeConvidado() {
        return nomeConvidado;
    }
    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }
    public String getEmailConvidado() {
        return emailConvidado;
    }
    public void setEmailConvidado(String emailConvidado) {
        this.emailConvidado = emailConvidado;
    }
    public String getTelefoneConvidado() {
        return telefoneConvidado;
    }
    public void setTelefoneConvidado(String telefoneConvidado) {
        this.telefoneConvidado = telefoneConvidado;
    }

    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
