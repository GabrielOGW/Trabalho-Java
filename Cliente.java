package Trabalho1ºBi;

abstract public class Cliente {
    String nome;
    Double valor;
    int parcelas;

     Double calcDesc(Double pagamento) {
        return 0.0;
    }

    Double calcParc(Double pagamento, int parcelas) {
        return 0.0;
    }
}