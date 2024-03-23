package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.TipoCliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(String id, String cliente,TipoCliente tpCli){
        super(id, cliente,  tpCli);
    }

    public boolean ivestir(double valor){
       if (this.sacar(valor)) {
           //acoes de transferencia
           return true;
       }
       return false;
    }


}
