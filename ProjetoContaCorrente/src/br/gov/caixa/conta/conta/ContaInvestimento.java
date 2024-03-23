package br.gov.caixa.conta.conta;

import br.gov.caixa.conta.enumeradores.TipoCliente;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(String id, String cliente, TipoCliente tpCli) {
        super(id, cliente, tpCli);
    }

    public void geraRendimentos(){
        if (super.tipo == TipoCliente.PESSOA_FISICA){
            this.depositar(this.consultarSaldo()*0.01);
        }else {
            this.depositar(this.consultarSaldo()*0.02);
        }
    }

}
