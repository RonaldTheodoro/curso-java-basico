package com.loiane.cursojava.aula31;

public class TestCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Ducato");
        van.setNumeroDePassageiros(10);
        van.setCapacidadeCombustivel(100);
        van.setConsumoCombustivel(0.2);

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        van.exibirAutonomia();
        double autonomiaVan = van.obterAutonomia();
        System.out.println("Autonomia: " + autonomiaVan);
        double quantidadeCombustivelVan10 = van.calculaCombustivel(10);
        double quantidadeCombustivelVan15 = van.calculaCombustivel(15);
        System.out.println("Quantidade de combustivel km 10: " + quantidadeCombustivelVan10);
        System.out.println("Quantidade de combustivel km 15: " + quantidadeCombustivelVan15);

        Carro fusca = new Carro();
        fusca.setMarca("Volkswagen");
        fusca.setModelo("Fusca");
        fusca.setNumeroDePassageiros(4);
        fusca.setCapacidadeCombustivel(30);
        fusca.setConsumoCombustivel(0.15);

        System.out.println(fusca.getMarca());
        System.out.println(fusca.getModelo());
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
