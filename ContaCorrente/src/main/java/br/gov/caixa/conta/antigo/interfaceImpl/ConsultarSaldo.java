package br.gov.caixa.conta.antigo.interfaceImpl;

import br.gov.caixa.conta.antigo.conta.Conta;
import br.gov.caixa.conta.antigo.enumeradores.Acao;
import br.gov.caixa.conta.antigo.historico.HistoricoAcao;

import java.util.Date;

public class ConsultarSaldo implements br.gov.caixa.conta.antigo.interfaces.ConsultarSaldo {
    @Override
    public Double executar(Conta conta) {
        conta.setHistorico(new HistoricoAcao(new Date(), Acao.CONSULTA,
                conta.getSaldo(), conta.getSaldo(), conta.getIdUsuario(), conta.getIdUsuario(),"",true));
        return conta.getSaldo();
    }
}
