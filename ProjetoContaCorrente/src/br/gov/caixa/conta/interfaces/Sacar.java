package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;

public interface Sacar {
    Boolean executar(Double valor, Conta conta, double tarifa);


}
