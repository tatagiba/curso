package br.gov.caixa.conta.conta.pessoafisica;

import br.gov.caixa.conta.conta.ContaCorrente;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.interfaces.PessoaFisica;

public class ContaCorrentePF extends ContaCorrente implements PessoaFisica {
    public ContaCorrentePF(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
