package br.gov.caixa.conta.antigo.interfaceImpl;

import br.gov.caixa.conta.antigo.conta.Conta;
import br.gov.caixa.conta.antigo.conta.pessoafisica.ContaCorrentePF;
import br.gov.caixa.conta.antigo.conta.pessoafisica.ContaInvestimentoPF;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaCorrentePJ;
import br.gov.caixa.conta.antigo.conta.pessoajuridica.ContaInvestimentoPJ;
import br.gov.caixa.conta.antigo.interfaceImpl.Transferir;
import br.gov.caixa.conta.antigo.enumeradores.Acao;

import static br.gov.caixa.conta.antigo.constantes.Constantes.TARIFA_SAQUE_PF;
import static br.gov.caixa.conta.antigo.constantes.Constantes.TARIFA_SAQUE_PJ;

public class Investir implements br.gov.caixa.conta.antigo.interfaces.Investir {
    public Boolean executar(ContaCorrentePF origem, ContaInvestimentoPF destino, double valor) {
        return executar(origem, destino, valor, TARIFA_SAQUE_PF);
    }

    public Boolean executar(ContaCorrentePJ origem, ContaInvestimentoPJ destino, double valor) {
        return executar(origem,destino,valor,TARIFA_SAQUE_PJ);
    }

    @Override
    public Boolean executar(Conta origem, Conta destino, double valor, double tarifa) {
        return Transferir.executar(origem, destino,valor,tarifa, Acao.INVESTIMENTO);
    }
}
