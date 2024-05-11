package br.gov.caixa.conta.antigo.interfaces;

import br.gov.caixa.conta.antigo.conta.Conta;

public interface Sacar {
    Boolean executar(Double valor, Conta conta, double tarifa);


}
