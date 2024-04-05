package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.TipoCliente;

public final class ContaPoupanca extends Conta{

    public ContaPoupanca(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
