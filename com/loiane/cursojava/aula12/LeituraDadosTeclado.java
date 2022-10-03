package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Digite a quantidade de filhos: ");
        byte quantidadeDeFilhos = scan.nextByte();

        System.out.print("Tem animal de estimação?: ");
        boolean temPet = scan.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de filhos: " + quantidadeDeFilhos);
        System.out.println("Tem animal de estimação: " + temPet);

        scan.close();
    }
}
