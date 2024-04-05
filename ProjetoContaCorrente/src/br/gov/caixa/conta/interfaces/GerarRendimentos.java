package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.conta.ContaInvestimento;

public interface GerarRendimentos {
    void executar(ContaInvestimento conta);
}
