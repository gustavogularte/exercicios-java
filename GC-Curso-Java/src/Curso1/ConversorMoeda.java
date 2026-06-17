package Curso1;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5;
        double valorReal = dolar * cotacaoDolar;
        return valorReal;
    }
}
