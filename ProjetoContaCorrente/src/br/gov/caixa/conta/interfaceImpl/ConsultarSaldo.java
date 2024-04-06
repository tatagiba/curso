package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.Date;

public class ConsultarSaldo implements br.gov.caixa.conta.interfaces.ConsultarSaldo {
    @Override
    public Double executar(Conta conta) {
        conta.setHistorico(new HistoricoAcao(new Date(), Acao.CONSULTA,
                conta.getSaldo(), conta.getSaldo(), conta.getIdUsuario(), conta.getIdUsuario(),"",true));
        return conta.getSaldo();
    }
}
