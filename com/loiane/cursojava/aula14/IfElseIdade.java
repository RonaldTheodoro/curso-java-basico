package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElseIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com a sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        System.out.print("Entre com preço do item: ");
        int valor = scan.nextInt();

        if (valor <= 10) {
            System.out.println("Esta barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }

        scan.close();
    }
}