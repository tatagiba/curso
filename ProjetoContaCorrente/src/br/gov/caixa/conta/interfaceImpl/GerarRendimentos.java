package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.historico.HistoricoAcao;

import java.util.Date;

import static br.gov.caixa.conta.constantes.Constantes.*;

public class GerarRendimentos implements br.gov.caixa.conta.interfaces.GerarRendimentos {
    @Override
    public void executar(ContaInvestimento conta) {
        double valorRendimentos;
        double porcentagemRendimentos;
        if (conta.getTipo() == TipoCliente.PESSOA_JURIDICA){
            porcentagemRendimentos =  RENDIMENTO_PJ;
        } else {
            porcentagemRendimentos = RENDIMENTO_PF;
        }

        valorRendimentos = CalculosComuns.calcularRendimentos(conta.getSaldo(),porcentagemRendimentos);

        conta.setSaldo(conta.getSaldo() + valorRendimentos);

        conta.setHistorico(new HistoricoAcao(new Date(), Acao.DEPOSITO,
                conta.getSaldo(), valorRendimentos,"usuario","usuario","Rendimentos investimento",true));

    }
}
