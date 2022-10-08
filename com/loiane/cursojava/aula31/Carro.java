package com.loiane.cursojava.aula31;

public class Carro {
    private String marca;
    private String modelo;
    private int numeroDePassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    public Carro() {}

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDePassageiros = 4;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDePassageiros() {
        return this.numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public double getCapacidadeCombustivel() {
        return this.capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return this.consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + obterAutonomia() + "km");
    }

    public double obterAutonomia() {
        return capacidadeCombustivel * consumoCombustivel;
    }

    public double calculaCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }

    private double divideKMPorConsumoCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
