package com.io.github.pedroolivsz.estruturaDeDados.TADNumero;

public class Number {
    private double value;

    public Number() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if(value < 0) {
            value = 0;
            System.out.println("Valor menor que zero -> corrigido para zero");
        } else if(value > 40 && value < 60) {
            if(value < 50) {
                value = 40;
                System.out.println("Valor no intervalo não suportado -> corrigido para 40");
            } else if(value >= 50) {
                value = 60;
                System.out.println("Valor no intervalo não suportado -> corrigido para 60");
            }
        } else if(value > 100) {
            value = 100;
            System.out.println("Valor maior que 100 -> corrigido para 100");
        }

        this.value = value;

        System.out.println("Novo valor atribuido.");
    }
}
