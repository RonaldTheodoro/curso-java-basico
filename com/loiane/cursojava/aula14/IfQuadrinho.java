package com.loiane.cursojava.aula14;

public class IfQuadrinho {
    public static void main(String[] args) {
        boolean temBatata = true;
        int ovos = 6;

        if (temBatata) {
            ovos = 9;
        }

        System.out.println("Compre " + ovos + " ovos.");
        
        int idade = 29;
        if (idade >= 18) {
            System.out.println("É maior de idade");
        }
    }
}