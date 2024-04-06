package br.gov.caixa.conta.conta.pessoajuridica;

import br.gov.caixa.conta.conta.ContaCorrente;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.interfaces.PessoaFisica;
import br.gov.caixa.conta.interfaces.PessoaJuridica;

public class ContaCorrentePJ extends ContaCorrente implements PessoaJuridica {
    public ContaCorrentePJ(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_JURIDICA);
    }
}
