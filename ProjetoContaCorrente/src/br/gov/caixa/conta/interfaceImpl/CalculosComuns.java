package br.gov.caixa.conta.interfaceImpl;

public   class CalculosComuns {

    public static double calcularTarifa(double valor, double tarifa){
        return valor * tarifa;
    }

    public static double calcularRendimentos(double valor, double juros){
        return valor * juros;
    }



}
