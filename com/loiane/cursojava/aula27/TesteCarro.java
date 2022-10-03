package com.loiane.cursojava.aula27;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDePassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        double autonomiaVan = van.obterAutonomia();
        System.out.println("Autonomia: " + autonomiaVan);
        double quantidadeCombustivelVan10 = van.calculaCombustivel(10);
        double quantidadeCombustivelVan15 = van.calculaCombustivel(15);
        System.out.println("Quantidade de combustivel km 10: " + quantidadeCombustivelVan10);
        System.out.println("Quantidade de combustivel km 15: " + quantidadeCombustivelVan15);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroDePassageiros = 4;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        fusca.obterAutonomia();
        double autonomiaFusca = fusca.obterAutonomia();
        System.out.println("Autonomia: " + autonomiaFusca);
        double quantidadeCombustivelFusca10 = fusca.calculaCombustivel(10);
        double quantidadeCombustivelFusca15 = fusca.calculaCombustivel(15);
        System.out.println("Quantidade de combustivel km 10: " + quantidadeCombustivelFusca10);
        System.out.println("Quantidade de combustivel km 15: " + quantidadeCombustivelFusca15);
    }
}