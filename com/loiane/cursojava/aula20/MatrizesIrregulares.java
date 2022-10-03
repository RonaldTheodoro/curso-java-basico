package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o numero de pessoas que serão entrevistasdas: ");
        int numeroDeEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numeroDeEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.print("Entre com a quantidade de filhos: ");
            int quantidadeDeFilhos = scan.nextInt();

            nomesFilhos[i] = new String[quantidadeDeFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.print("Digite o nome do filho " + (j + 1) + ": ");
                nomesFilhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println(
                String.format(
                    "Pessoa %d tem %d filhos",
                    i + 1,
                    nomesFilhos[i].length
                )
            );
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }

        scan.close();
    }
}