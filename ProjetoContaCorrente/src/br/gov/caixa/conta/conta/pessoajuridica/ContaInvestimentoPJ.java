package br.gov.caixa.conta.conta.pessoajuridica;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.interfaces.PessoaFisica;
import br.gov.caixa.conta.interfaces.PessoaJuridica;

public class ContaInvestimentoPJ extends ContaInvestimento implements PessoaJuridica {
    public ContaInvestimentoPJ(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_JURIDICA);
    }
}
