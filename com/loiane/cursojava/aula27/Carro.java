package com.loiane.cursojava.aula27;

public class Carro {
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + obterAutonomia() + "km");
    }

    double obterAutonomia() {
        return capacidadeCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km / consumoCombustivel;
    }
}