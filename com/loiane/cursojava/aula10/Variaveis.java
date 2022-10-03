package com.loiane.cursojava.aula10;

class Variaveis {
    public static void main(String[] args) {
        int idade = 29;
        String nome = "Ronald";
        String nomeDoMeuCachorro = "Saori";

        // Não é convenção java
        int _idade;
        int $idade;
        String ano2022;
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        idade = 30;

        System.out.println("Idade = " + idade);
        System.out.println("None = " + nome);

        int a = 10;
        String b = "Ronald";

        char o = 111;
        char i = 105;
        char interrogacao = 0x00E1;
        System.out.println("" + o + i + interrogacao);
    }
}