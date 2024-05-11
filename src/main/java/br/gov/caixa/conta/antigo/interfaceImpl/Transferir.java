package br.gov.caixa.conta.antigo.interfaceImpl;

import br.gov.caixa.conta.antigo.conta.Conta;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.antigo.enumeradores.Acao;
import br.gov.caixa.conta.antigo.enumeradores.Status;

import static br.gov.caixa.conta.antigo.constantes.Constantes.TARIFA_SAQUE_PF;
import static br.gov.caixa.conta.antigo.constantes.Constantes.TARIFA_SAQUE_PJ;

public class Transferir implements br.gov.caixa.conta.antigo.interfaces.Transferir {

    public Boolean executar(Conta origem, Conta destino, double valor) {
        return executar(origem, destino, valor, TARIFA_SAQUE_PF);
    }

    public Boolean executar(ContaCorrentePJ origem, Conta destino, double valor) {
        return executar(origem,destino,valor,TARIFA_SAQUE_PJ);
    }

    public Boolean executar(Conta origem, Conta destino, double valor, double tarifa) {
        return executar(origem,destino, valor,tarifa,Acao.TRANSFERENCIA);
    }

    public static Boolean executar(Conta origem, Conta destino, double valor, double tarifa, Acao acao) {
        boolean retorno = false;
        if(origem.getStatus() == Status.INATIVO || destino.getStatus() == Status.INATIVO){
            return retorno;
        }
        retorno = Sacar.executar(valor,origem,tarifa,acao,destino.getIdUsuario());
        if (retorno){
            Depositar.executar(valor,destino,acao,origem.getIdUsuario());
        }

        return retorno;
    }
}
