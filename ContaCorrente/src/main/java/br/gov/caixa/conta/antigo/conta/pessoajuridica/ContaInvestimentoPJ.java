package br.gov.caixa.conta.antigo.conta.pessoajuridica;

import br.gov.caixa.conta.antigo.conta.ContaInvestimento;
import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;
import br.gov.caixa.conta.antigo.interfaces.PessoaJuridica;

public class ContaInvestimentoPJ extends ContaInvestimento implements PessoaJuridica {
    public ContaInvestimentoPJ(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_JURIDICA);
    }
}
