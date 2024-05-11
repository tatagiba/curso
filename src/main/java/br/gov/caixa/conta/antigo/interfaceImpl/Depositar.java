package br.gov.caixa.conta.antigo.interfaceImpl;

import br.gov.caixa.conta.antigo.conta.Conta;
import br.gov.caixa.conta.antigo.enumeradores.Acao;
import br.gov.caixa.conta.antigo.historico.HistoricoAcao;

import java.util.Date;

public class Depositar implements br.gov.caixa.conta.antigo.interfaces.Depositar {

    public static Boolean executar(Double valor, Conta conta,Acao acao, String origem) {
        boolean sucesso;
        if (valor<0){
            sucesso = false;
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
            sucesso = true;
        }
        conta.setHistorico(new HistoricoAcao(new Date(), Acao.DEPOSITO,
                valor, valor,conta.getIdUsuario(),conta.getIdUsuario(),"",sucesso));

        return sucesso;
    }
    public Boolean executar(Double valor, Conta conta){
        return executar(valor, conta,Acao.DEPOSITO,conta.getIdUsuario());
    }
}
