package com.loiane.cursojava.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro(
                "Fiat",
                "Ducato",
                10,
                100,
                0.2);

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        double autonomiaVan = van.obterAutonomia();
        System.out.println("Autonomia: " + autonomiaVan);
        double quantidadeCombustivelVan10 = van.calculaCombustivel(10);
        double quantidadeCombustivelVan15 = van.calculaCombustivel(15);
        System.out.println("Quantidade de combustivel km 10: " + quantidadeCombustivelVan10);
        System.out.println("Quantidade de combustivel km 15: " + quantidadeCombustivelVan15);

        Carro fusca = new Carro(
                "Volkswagen",
                "Fusca",
                4,
                30,
                0.15);

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

        Carro gol = new Carro("Fiat", "Ducato");
        gol.numeroDePassageiros = 10;
        gol.capacidadeCombustivel = 100;
        gol.consumoCombustivel = 0.2;

        System.out.println(gol.marca);
        System.out.println(gol.modelo);
        gol.exibirAutonomia();
        double autonomiagol = gol.obterAutonomia();
        System.out.println("Autonomia: " + autonomiagol);
        double quantidadeCombustivelgol10 = gol.calculaCombustivel(10);
        double quantidadeCombustivelgol15 = gol.calculaCombustivel(15);
        System.out.println("Quantidade de combustivel km 10: " + quantidadeCombustivelgol10);
        System.out.println("Quantidade de combustivel km 15: " + quantidadeCombustivelgol15);
    }
}