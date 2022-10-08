package com.loiane.cursojava.aula34;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Calculadora calculadora = new Calculadora();

        System.out.println(Calculadora.soma(8, 1));
        System.out.println(Calculadora.soma(5, 6, 9));
        int[] numsInt = {1, 2, 3};
        System.out.println(Calculadora.soma(numsInt));
        System.out.println(Calculadora.soma(0.5, 0.9));
        System.out.println(Calculadora.soma(0.5, 0.9, 0.17));
        double[] numsDouble = {0.4, 0.6, 0.78};
        System.out.println(Calculadora.soma(numsDouble));
    }
}
