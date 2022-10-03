package com.loiane.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor01 = 1;
        int valor02 = 2;

        boolean resultado01 = (valor01 == 1) && (valor02 == 2);
        System.out.println(
            "valor01 é 1 AND valor02 é 2 - resultado: " + resultado01
        );

        boolean resultado02 = (valor01 == 1) || (valor02 == 2);
        System.out.println(
            "valor01 é 1 OR valor02 é 2 - resultado: " + resultado02
        );

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}