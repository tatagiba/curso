package br.gov.caixa.conta.antigo.conta.pessoafisica;

import br.gov.caixa.conta.antigo.conta.ContaInvestimento;
import br.gov.caixa.conta.antigo.enumeradores.TipoCliente;
import br.gov.caixa.conta.antigo.interfaces.PessoaFisica;

public class ContaInvestimentoPF extends ContaInvestimento implements PessoaFisica {
    public ContaInvestimentoPF(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
