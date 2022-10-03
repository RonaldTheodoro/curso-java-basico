package com.loiane.cursojava.aula18;

public class BreakLabel {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            rotulo01: {
                rotulo02: {
                    rotulo03: {
                        if (i == 1) {
                            break rotulo01;
                        }
                        if (i == 2) {
                            break rotulo02;
                        }
                        if (i == 3) {
                            break rotulo03;
                        }
                        System.out.println("rotulo03");
                    }
                    System.out.println("rotulo02");
                }
                System.out.println("rotulo01");
            }
            System.out.println(i);
        }
    }
}