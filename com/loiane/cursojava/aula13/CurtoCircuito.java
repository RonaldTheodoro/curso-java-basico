package com.loiane.cursojava.aula13;

public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro & falso);
        System.out.println(verdadeiro && falso);
        System.out.println(falso & verdadeiro);
        System.out.println(falso && verdadeiro);
        
        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }
}