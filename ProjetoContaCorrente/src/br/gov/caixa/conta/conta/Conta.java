package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.enumeradores.Status;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private String id;
    private double saldo;
    private Date historico;
    private  Date atualização;
    private Status status;
    private String idUsuario;
    protected TipoCliente tipo;

    private List<HistoricoAcao> historicoAcoes = new ArrayList<>();


    Conta(String id, String idUsu,TipoCliente tipo){
        this.id = id;
        this.saldo = 0.00;
        this.historico = new Date();
        this.atualização = new Date();
        this.status = Status.ATIVO;
        this.idUsuario = idUsu;
        this.tipo = tipo;

    }

    public boolean sacar(double valor){
        boolean retorno;
        double valorReal = valor;
        if(this.tipo == TipoCliente.PESSOA_JURIDICA){
            valorReal = valor + calculaTarifa(valor);
            retorno =  this.efetivarSaque(valorReal);

        }
        retorno = this.efetivarSaque(valor);

        historicoAcoes.add(new HistoricoAcao(Acao.SAQUE,valor, valorReal, idUsuario,"", retorno));
        return retorno;
    }
    private boolean efetivarSaque(double valor){
        if (valor > this.saldo)
            return false;
        else {
           this.saldo =  this.saldo - valor;
            return true;
        }

    }

    private double calculaTarifa(double valor){
        return valor * 0.05;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double consultarSaldo(){
        return this.saldo;
    }
    public boolean transferencia(double valor, String destinatario){
        //teste para saber se tem saldo suficiente para transferência
        if (valor > this.saldo)
            return false;
        else {
            this.saldo =  this.saldo - valor;
            return true;
        }
    }

    public String getIdUsuario(){
        return this.idUsuario;
    }

    public String getidConta(){
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
