package br.gov.caixa.conta.antigo.conta.pessoafisica;

import br.gov.caixa.conta.antigo.conta.ContaCorrente;
import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;
import br.gov.caixa.conta.antigo.interfaces.PessoaFisica;

public class ContaCorrentePF extends ContaCorrente implements PessoaFisica {
    public ContaCorrentePF(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
