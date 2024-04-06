package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.enumeradores.Acao;
import br.gov.caixa.conta.historico.HistoricoAcao;
import br.gov.caixa.conta.util.RendimentoUtil;

import java.util.Date;

import static br.gov.caixa.conta.constantes.Constantes.*;

public class GerarRendimentos implements br.gov.caixa.conta.interfaces.GerarRendimentos {

    public void executar(ContaInvestimentoPF conta) {
       executar(conta,RENDIMENTO_PF);
    }
    public void executar(ContaInvestimentoPJ conta) {
        executar(conta,RENDIMENTO_PJ);

    }

    @Override
    public void executar(ContaInvestimento conta, Double rendimento) {
        double valorRendimentos;
        valorRendimentos = RendimentoUtil.calcularRendimentos(conta.getSaldo(),rendimento);
        conta.setSaldo(conta.getSaldo() + valorRendimentos);
        conta.setHistorico(new HistoricoAcao(new Date(), Acao.CREDITO_RENDIMENTO,
                conta.getSaldo(), valorRendimentos,conta.getIdUsuario(),
                conta.getIdUsuario(),"Rendimentos investimento",true));


        }


}
