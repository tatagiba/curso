package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.Date;

import static br.gov.caixa.conta.constantes.Constantes.TARIFA_SAQUE_PJ;

public class Sacar implements br.gov.caixa.conta.interfaces.Sacar {


    @Override
    public Boolean executar(Double valor, Conta conta) {
        boolean sucesso;
        double valorTotalOperacao = valor;
        if (conta.getTipo() == TipoCliente.PESSOA_JURIDICA){
            valorTotalOperacao = valor + CalculosComuns.calcularTarifa (valor, TARIFA_SAQUE_PJ);
        }
        sucesso =  checarSaldo(valorTotalOperacao, conta);
        if (sucesso){
            conta.setSaldo(conta.getSaldo() - valorTotalOperacao);
        }

        conta.setHistorico(new HistoricoAcao(new Date(), Acao.SAQUE,
                valor, valorTotalOperacao, "usuario", "usuario", "", sucesso));

        return sucesso;
    }


    private boolean checarSaldo(Double valor, Conta conta) {
        if (valor > conta.getSaldo()) {
            return false;
        }
        return true;
    }

}