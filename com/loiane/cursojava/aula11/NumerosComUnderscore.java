package com.loiane.cursojava.aula11;

public class NumerosComUnderscore {
    public static void main(String[] args) {
        long creditCardNunber = 1234_5467_9012_3456L;
        long cpf = 101_134_156_68L;
        float pi = 3.14_15f;
        long hexBytes = 0xFF_EC_DE_5E;
        long maxWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        System.out.println("creditCardNunber: " + creditCardNunber);
        System.out.println("cpf: " + cpf);
        System.out.println("pi: " + pi);
        System.out.println("hexBytes: " + hexBytes);
        System.out.println("maxWords: " + maxWords);
        System.out.println("maxLong: " + maxLong);
        System.out.println("nybbles: " + nybbles);
        System.out.println("bytes: " + bytes);
    }
}