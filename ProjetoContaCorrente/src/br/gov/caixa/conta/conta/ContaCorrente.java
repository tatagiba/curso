package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.TipoCliente;

public abstract class ContaCorrente extends Conta{

    public ContaCorrente(String id, String cliente,TipoCliente tpCli){
        super(id, cliente,  tpCli);
    }



}
