package br.gov.caixa.conta.historico;

import br.gov.caixa.conta.enumeradores.Acao;

import java.util.Date;

public class HistoricoAcao {

    private Date data;
    private Acao acao;
    private double valorPretendido;
    private double valorReal;
    private String idUsuarioOrigem;
    private String getIdUsuarioDestino;
    private String observacao;
    private boolean exito;

    public HistoricoAcao(Acao ac, double valp, double valr, String usuOr, String usuDes, String obs, boolean sucesso) {

        this.data = new Date();
        this.acao = ac;
        this.valorPretendido = valp;
        this.valorReal = valr;
        this.idUsuarioOrigem = usuOr;
        this.getIdUsuarioDestino = usuDes;
        this.observacao = obs;
        this.exito = sucesso;
    }

    public HistoricoAcao(Acao ac, double valp, double valr, String usuOr, String obs, boolean sucesso) {

        this.data = new Date();
        this.acao = ac;
        this.valorPretendido = valp;
        this.valorReal = valr;
        this.idUsuarioOrigem = usuOr;
        this.getIdUsuarioDestino = "N/A";
        this.observacao = obs;
        this.exito = sucesso;
    }
    //criar construtores sem o usuario destino e sem observação 


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public double getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(double valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public String getIdUsuarioOrigem() {
        return idUsuarioOrigem;
    }

    public void setIdUsuarioOrigem(String idUsuarioOrigem) {
        this.idUsuarioOrigem = idUsuarioOrigem;
    }

    public String getGetIdUsuarioDestino() {
        return getIdUsuarioDestino;
    }

    public void setGetIdUsuarioDestino(String getIdUsuarioDestino) {
        this.getIdUsuarioDestino = getIdUsuarioDestino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }
}

