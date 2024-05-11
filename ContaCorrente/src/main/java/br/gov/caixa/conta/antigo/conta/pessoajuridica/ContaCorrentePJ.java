package br.gov.caixa.conta.antigo.conta.pessoajuridica;

import br.gov.caixa.conta.antigo.conta.ContaCorrente;
import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;
import br.gov.caixa.conta.antigo.interfaces.PessoaJuridica;

public class ContaCorrentePJ extends ContaCorrente implements PessoaJuridica {
    public ContaCorrentePJ(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_JURIDICA);
    }
}
