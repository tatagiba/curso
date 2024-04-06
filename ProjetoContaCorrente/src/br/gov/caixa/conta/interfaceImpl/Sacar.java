package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.conta.pessoafisica.ContaCorrentePF;
import br.gov.caixa.conta.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.conta.pessoafisica.ContaPoupanca;
import br.gov.caixa.conta.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.historico.HistoricoAcao;
import br.gov.caixa.conta.util.SaldoUtil;
import br.gov.caixa.conta.util.TarifaUtil;

import java.util.Date;

import static br.gov.caixa.conta.constantes.Constantes.TARIFA_SAQUE_PF;
import static br.gov.caixa.conta.constantes.Constantes.TARIFA_SAQUE_PJ;


public class Sacar implements br.gov.caixa.conta.interfaces.Sacar {

    public Boolean executar(Double valor, Conta conta) {
        return executar(valor, conta,TARIFA_SAQUE_PF);
    }

    public Boolean executar(Double valor, ContaCorrentePJ conta) {
        return executar(valor, conta,TARIFA_SAQUE_PJ);
    }

    @Override
    public Boolean executar(Double valor, Conta conta, double tarifa) {
        return executar(valor,conta,tarifa,Acao.SAQUE, conta.getIdUsuario());

    }
    public static Boolean executar(Double valor, Conta conta, double tarifa,Acao acao, String idDestino) {
        boolean sucesso = false;
        double valorTotalOperacao = valor;

        valorTotalOperacao = valor + TarifaUtil.calcularTarifa(valor, tarifa);
        sucesso =  SaldoUtil.checarSaldo(valorTotalOperacao, conta);
        if (sucesso){
            conta.setSaldo(conta.getSaldo() - valorTotalOperacao);
        }
        conta.setHistorico(new HistoricoAcao(new Date(), acao,
                valor, valorTotalOperacao, conta.getIdUsuario(), conta.getIdUsuario(), "", sucesso));
        return sucesso;
    }





}