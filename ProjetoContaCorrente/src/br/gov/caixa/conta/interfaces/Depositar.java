package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;

public interface Depositar {
    Boolean executar(Double valor, Conta conta);
}
