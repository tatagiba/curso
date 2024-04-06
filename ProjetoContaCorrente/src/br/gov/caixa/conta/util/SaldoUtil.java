package br.gov.caixa.conta.util;

import br.gov.caixa.conta.conta.Conta;

public  class SaldoUtil {
    public static boolean checarSaldo(Double valor, Conta conta) {
        if (valor > conta.getSaldo()) {
            return false;
        }
        return true;
    }
}
