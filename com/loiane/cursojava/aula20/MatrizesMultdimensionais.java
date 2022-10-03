package com.loiane.cursojava.aula20;

public class MatrizesMultdimensionais {
    public static void main(String[] args) {
        int[][][] matriz = new int[5][5][5];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                for (int z = 0; z < matriz[x][y].length; z++) {
                    matriz[x][y][z] = x + y + z;
                }
            }
        }

        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                for (int z = 0; z < matriz[x][y].length; z++) {
                    somaTotal = matriz[x][y][z];
                    if (matriz[x][y][z] % 2 == 0) {
                        somaPares = matriz[x][y][z];
                    } else {
                        somaImpares = matriz[x][y][z];
                    }
                }
            }
        }

        System.out.println();

        System.out.println(String.format("Soma total: %d", somaTotal));
        System.out.println(String.format("Soma pares: %d", somaPares));
        System.out.println(String.format("Soma impares: %d", somaImpares));
    }
}