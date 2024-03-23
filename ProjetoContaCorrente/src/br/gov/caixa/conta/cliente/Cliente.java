package br.gov.caixa.conta.cliente;

import br.gov.caixa.conta.enumeradores.Status;

import java.util.Date;

//transformar essa classe em abstract

public class Cliente {
    private String id;
    private String classificacao;
    private String nome;
    private Date dataCadastro;
    private Status status;

    Cliente(String id, String classificacao, String nome, Date data, Status st){
        this.id = id;
        this.classificacao = classificacao;
        this.nome = nome;
        this.dataCadastro = data;
        this.status = st;

    }

    public String getId() {
        return id;
    }


    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }


    public Status isStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
