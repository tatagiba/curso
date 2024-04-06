package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.TipoCliente;

public abstract class ContaInvestimento extends Conta{
    public ContaInvestimento(String id, String cliente, TipoCliente tpCli) {
        super(id, cliente, tpCli);
    }


}
