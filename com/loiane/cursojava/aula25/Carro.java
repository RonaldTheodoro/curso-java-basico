package com.loiane.cursojava.aula25;

public class Carro {
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
    }
}