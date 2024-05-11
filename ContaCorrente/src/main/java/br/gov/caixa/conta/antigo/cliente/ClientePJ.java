package br.gov.caixa.conta.antigo.cliente;

import br.gov.caixa.conta.antigo.conta.ContaInvestimento;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.antigo.enumeradores.Status;
import br.gov.caixa.conta.antigo.conta.ContaCorrente;

import java.util.Date;

public final class ClientePJ extends Cliente{
    ContaInvestimento investimentoPJ = null;
    ClientePJ(String id, String classificacao, String nome){
        super(id, classificacao, nome, new Date(), Status.ATIVO);

        ContaCorrente contaPj = new ContaCorrentePJ("1", id);
        ContaInvestimento investimentoPJ = new ContaInvestimentoPJ("1", id);

    }


}
