package br.gov.caixa.conta.cliente;

import br.gov.caixa.conta.enumeradores.Status;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.conta.ContaCorrente;

import java.util.Date;

public final class ClientePF extends Cliente{

    ClientePF(String id, String classificacao, String nome){
        super(id, classificacao, nome, new Date(), Status.ATIVO);

        ContaCorrente  contaPf = new ContaCorrente("1", id, TipoCliente.PESSOA_FISICA);




    }
}
