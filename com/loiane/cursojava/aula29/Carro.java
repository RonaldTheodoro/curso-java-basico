package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(
            String marca,
            String modelo,
            int numeroDePassageiros,
            double capacidadeCombustivel,
            double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

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