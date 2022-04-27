package Trabalho1ºBi;

public class ClienteComum extends Cliente {
    
    @Override
    Double calcDesc(Double pagamento) {
        Double descC = 0.98;
        pagamento = pagamento * descC;
        return pagamento;
    }
    
    @Override
    Double calcParc(Double pagamento, int parcelas) {
        Double jurosC = 0.05;
        double CF;
        CF = jurosC / (1 - Math.pow((1 + jurosC), - parcelas));
        Double ValorParc = pagamento * CF;
        return ValorParc; 
    }
}
