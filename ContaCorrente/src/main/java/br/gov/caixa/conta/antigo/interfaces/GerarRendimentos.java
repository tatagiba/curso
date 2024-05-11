package br.gov.caixa.conta.antigo.interfaces;

import br.gov.caixa.conta.antigo.conta.ContaInvestimento;

public interface GerarRendimentos {
    void executar(ContaInvestimento conta, Double rendimento);
}
