package Trabalho1ºBi;

import javax.swing.JOptionPane;

public class ExecCliente { 

    // Define valores para comparação de criação de clientes.
    static Double ValorComum = 3000.0;
    static Double ValorGold = 10000.0;

    public static void main(String[] args) {
        // Capitação de informações como: Nome do Cliente, Valor de compra, e forma de pagamento.
        String nomeC = JOptionPane.showInputDialog("Qual o nome do cliente: ");
        Double compra = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da compra: "));
        int op = (int) Double.parseDouble(JOptionPane.showInputDialog("Qual a forma de pagamento:\n1 - À Vista\n2 - A Prazo"));
        
        // Compara o valor da compra com o valor definido para criação de um novo tipo de cliente
        if(compra <= ValorComum) {
            ClienteComum clienteC = new ClienteComum();
            clienteC.valor = compra;
            clienteC.nome = nomeC;
            // Comparação com a forma de pagamento para realizar calculo de desconto ou juros.
            if(op == 1){
                JOptionPane.showMessageDialog(null, "Valor final: R$" + clienteC.calcDesc(clienteC.valor), "Cliente Comum", JOptionPane.INFORMATION_MESSAGE); 
            } else {
                clienteC.parcelas = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Será pago em quantas parcelas: "));
                JOptionPane.showMessageDialog(null, "Valor das parcelas: R$" + clienteC.calcParc(clienteC.valor, clienteC.parcelas), "Cliente Comum", JOptionPane.INFORMATION_MESSAGE); 
            }
        } else if(compra <= ValorGold) {
            ClienteGold clienteG = new ClienteGold();
            clienteG.valor = compra;
            clienteG.nome = nomeC;
            if(op == 1){
                JOptionPane.showMessageDialog(null, "Valor final: R$" + clienteG.calcDesc(clienteG.valor), "Cliente Gold", JOptionPane.INFORMATION_MESSAGE); 
            } else {
                clienteG.parcelas = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Será pago em quantas parcelas: ")); 
                JOptionPane.showMessageDialog(null, "Valor das parcelas: R$" + clienteG.calcParc(clienteG.valor, clienteG.parcelas), "Cliente Gold", JOptionPane.INFORMATION_MESSAGE); 
            }
        } else {
            ClienteDiamond clienteD = new ClienteDiamond();
            clienteD.valor = compra;
            clienteD.nome = nomeC;
            if(op == 1){
                JOptionPane.showMessageDialog(null, "Valor final: R$" + clienteD.calcDesc(clienteD.valor), "Cliente Diamond", JOptionPane.INFORMATION_MESSAGE); 
            } else {
                clienteD.parcelas = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Será pago em quantas parcelas: ")); 
                JOptionPane.showMessageDialog(null, "Valor das parcelas: R$" + clienteD.calcParc(clienteD.valor, clienteD.parcelas), "Cliente Diamond", JOptionPane.INFORMATION_MESSAGE); 
            }
        }
    }
}
