package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.enumeradores.Status;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta {
    private String id;
    private double saldo;
    private Date historico;
    private  Date atualizacao;
    private Status status;
    private String idUsuario;
    protected TipoCliente tipo;
    private List<HistoricoAcao> historicoAcoes = new ArrayList<>();


    public Conta(String id, String idUsu,TipoCliente tipo){
        this.id = id;
        this.saldo = 0.00;
        this.historico = new Date();
        this.atualizacao = new Date();
        this.status = Status.ATIVO;
        this.idUsuario = idUsu;
        this.tipo = tipo;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getHistorico() {
        return historico;
    }

    public void setHistorico(Date historico) {
        this.historico = historico;
    }

    public Date getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(Date atualizacao) {
        this.atualizacao = atualizacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public List<HistoricoAcao> getHistoricoAcoes() {
        return historicoAcoes;
    }

    public void setHistorico(HistoricoAcao historicoAcoes) {
        this.historicoAcoes.add(historicoAcoes);
    }
}
