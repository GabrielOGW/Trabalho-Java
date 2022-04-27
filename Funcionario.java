package Trabalho1ºBi;

public class Funcionario {
    String nome;
    static Double salario;
    int dependentes;

    Double aumento = 0.0;
    Double vlrExtra = 0.0;
    Double desconto = 0.0;

    Double calcAumento() {
        if (salario <= 5000) {
            aumento = salario * 10 / 100;
        } else {
            aumento = salario * 8 / 100;
        }
        salario = salario + aumento;
        return aumento;
    }

    Double calcDepend() {
        for(int i = 0; i < dependentes; i++) {
            vlrExtra = vlrExtra + 200;
        }
        salario = salario + vlrExtra ;
        return vlrExtra;
    }

    Double CalcDesc() {
        if (salario <= 3000) {
            desconto = salario * 7 / 100;
        } else if(salario <= 7000) {
            desconto = salario * 10 / 100;
        } else if(salario > 7000) {
            desconto = salario * 15 / 100;
        }
        // salario = salario - desconto;
        return desconto;
    }

    Double SalarioLiq() {
        salario = salario - desconto;
        return salario;
    }
}