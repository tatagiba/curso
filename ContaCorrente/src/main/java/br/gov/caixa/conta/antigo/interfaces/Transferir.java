package br.gov.caixa.conta.antigo.interfaces;

import br.gov.caixa.conta.antigo.conta.Conta;

public interface Transferir {
    Boolean executar (Conta origem, Conta destino, double valor, double tarifa);
}
