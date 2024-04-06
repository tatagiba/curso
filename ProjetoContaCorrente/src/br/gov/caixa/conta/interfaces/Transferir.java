package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;

public interface Transferir {
    Boolean executar (Conta origem, Conta destino, double valor, double tarifa);
}
