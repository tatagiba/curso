package br.gov.caixa.conta.antigo.conta.pessoafisica;

import br.gov.caixa.conta.antigo.conta.Conta;
import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;
import br.gov.caixa.conta.antigo.interfaces.PessoaFisica;

public final class ContaPoupanca extends Conta implements PessoaFisica {

    public ContaPoupanca(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
