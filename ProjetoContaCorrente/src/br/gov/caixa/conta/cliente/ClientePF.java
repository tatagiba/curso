package br.gov.caixa.conta.cliente;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.conta.pessoafisica.ContaCorrentePF;
import br.gov.caixa.conta.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.conta.pessoafisica.ContaPoupanca;
import br.gov.caixa.conta.enumeradores.Status;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.conta.ContaCorrente;

import java.util.Date;

public final class ClientePF extends Cliente{

    ContaCorrente  contaPf = null;
    ContaInvestimento investimentoPF = null;
    ContaPoupanca poupanca = null;


    ClientePF(String id, String classificacao, String nome){
        super(id, classificacao, nome, new Date(), Status.ATIVO);

        contaPf = new ContaCorrentePF("1", id);
        investimentoPF = new ContaInvestimentoPF("1",id);
        poupanca = new ContaPoupanca("1", id);
    }
}
