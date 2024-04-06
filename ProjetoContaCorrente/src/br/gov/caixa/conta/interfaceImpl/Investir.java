package br.gov.caixa.conta.interfaceImpl;

import br.gov.caixa.conta.conta.Conta;
import br.gov.caixa.conta.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.enumeradores.Acao;

import static br.gov.caixa.conta.constantes.Constantes.TARIFA_SAQUE_PF;
import static br.gov.caixa.conta.constantes.Constantes.TARIFA_SAQUE_PJ;

public class Investir implements br.gov.caixa.conta.interfaces.Investir {
    public Boolean executar(Conta origem, ContaInvestimentoPF destino, double valor) {
        return executar(origem, destino, valor, TARIFA_SAQUE_PF);
    }

    public Boolean executar(Conta origem, ContaInvestimentoPJ destino, double valor) {
        return executar(origem,destino,valor,TARIFA_SAQUE_PJ);
    }

    @Override
    public Boolean executar(Conta origem, Conta destino, double valor, double tarifa) {
        return Transferir.executar(origem, destino,valor,tarifa, Acao.INVESTIMENTO);
    }
}
