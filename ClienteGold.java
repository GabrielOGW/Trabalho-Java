package Trabalho1ºBi;

public class ClienteGold extends Cliente {
    
    @Override
    Double calcDesc(Double pagamento) {
        Double descC = 0.96;
        pagamento = pagamento * descC;
        return pagamento;
    }

    @Override
    Double calcParc(Double pagamento, int parcelas) {
        Double jurosC = 0.03;
        double CF;
        CF = jurosC / (1 - Math.pow((1 + jurosC), - parcelas));
        Double ValorParc = pagamento * CF;
        return ValorParc;
    }
}