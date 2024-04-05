package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;

public interface Investir {
    Boolean executar(Conta origem, Conta destino, Double valor);
}
