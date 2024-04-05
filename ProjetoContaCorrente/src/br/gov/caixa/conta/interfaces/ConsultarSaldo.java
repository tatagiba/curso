package br.gov.caixa.conta.interfaces;

import br.gov.caixa.conta.conta.Conta;

public interface ConsultarSaldo {

    Double executar(Conta conta);
}
