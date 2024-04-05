package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.Date;

public class Depositar implements br.gov.caixa.conta.interfaces.Depositar {
    @Override
    public Boolean executar(Double valor, Conta conta) {
        boolean sucesso;
        if (valor<0){
            sucesso = false;
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
            sucesso = true;
        }
        conta.setHistorico(new HistoricoAcao(new Date(), Acao.DEPOSITO,
                valor, valor,"usuario","usuario","",sucesso));

        return sucesso;
    }
}
