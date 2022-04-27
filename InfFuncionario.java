package Trabalho1ºBi;

import javax.swing.JOptionPane;

public class InfFuncionario {
    public static void main(String[] args) {
        // Criação do funcionário
        Funcionario funcionario = new Funcionario();
        // Coleta de informações: nome, salário e dependentes.
        funcionario.nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
        Funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário: "));
        funcionario.dependentes = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos dependentes você tem: "));
        // Informa quais serão as bonificações e descontos do funcionário
        JOptionPane.showMessageDialog(null, "Aumento: R$" + funcionario.calcAumento());
        JOptionPane.showMessageDialog(null, "Valor extra sobre dependente(s): R$" + funcionario.calcDepend());
        JOptionPane.showMessageDialog(null, "desconto/impostos:  R$" + funcionario.CalcDesc());
        JOptionPane.showMessageDialog(null, "Salario Liquido: R$" + funcionario.SalarioLiq());   
    }
}
