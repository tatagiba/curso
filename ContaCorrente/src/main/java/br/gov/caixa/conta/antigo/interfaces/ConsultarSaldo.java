package br.gov.caixa.conta.antigo.interfaces;

import br.gov.caixa.conta.antigo.conta.Conta;

public interface ConsultarSaldo {

    Double executar(Conta conta);
}
