package br.gov.caixa.conta.cliente;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.enumeradores.Status;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.conta.ContaCorrente;

import java.util.Date;

public final class ClientePJ extends Cliente{
    ContaInvestimento investimentoPJ = null;
    ClientePJ(String id, String classificacao, String nome){
        super(id, classificacao, nome, new Date(), Status.ATIVO);

        ContaCorrente contaPj = new ContaCorrentePJ("1", id);


    }


}
