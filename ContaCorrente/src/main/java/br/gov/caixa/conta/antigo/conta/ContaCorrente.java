package br.gov.caixa.conta.antigo.conta;

import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;

public abstract class ContaCorrente extends Conta{

    public ContaCorrente(String id, String cliente,TipoCliente tpCli){
        super(id, cliente,  tpCli);
    }



}
