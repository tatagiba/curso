package br.gov.caixa.conta.antigo.interfaceImpl;

import br.gov.caixa.conta.antigo.conta.ContaInvestimento;
import br.gov.caixa.conta.antigo.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.antigo.enumeradores.Acao;
import br.gov.caixa.conta.antigo.historico.HistoricoAcao;
import br.gov.caixa.conta.util.RendimentoUtil;

import java.util.Date;

import static br.gov.caixa.conta.antigo.constantes.Constantes.*;

public class GerarRendimentos implements br.gov.caixa.conta.antigo.interfaces.GerarRendimentos {

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
