package br.gov.caixa.conta.conta.pessoafisica;

import br.gov.caixa.conta.conta.ContaInvestimento;
import br.gov.caixa.conta.enumeradores.TipoCliente;
import br.gov.caixa.conta.interfaces.PessoaFisica;

public class ContaInvestimentoPF extends ContaInvestimento implements PessoaFisica {
    public ContaInvestimentoPF(String id, String cliente) {
        super(id, cliente, TipoCliente.PESSOA_FISICA);
    }
}
