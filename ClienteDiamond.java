package Trabalho1ºBi;

public class ClienteDiamond extends Cliente {
    
    @Override
    Double calcDesc(Double pagamento) {
        Double descC = 0.93;
        pagamento = pagamento * descC;
        return pagamento;
    }

    @Override
    Double calcParc(Double pagamento, int parcelas) {
        Double jurosC = 0.02;
        double CF;
        CF = jurosC / (1 - Math.pow((1 + jurosC), - parcelas));
        Double ValorParc = pagamento * CF;
        return ValorParc;
    }
}
