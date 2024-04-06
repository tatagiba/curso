package br.gov.caixa.conta.conta.pessoafisica;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.interfaces.PessoaFisica;

public final class ContaPoupanca extends Conta implements PessoaFisica {

    public ContaPoupanca(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
