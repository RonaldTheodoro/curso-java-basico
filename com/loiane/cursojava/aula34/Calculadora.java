package com.loiane.cursojava.aula34;

public class Calculadora {
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] nums) {
        int result = 0;

        for (int n : nums) {
            result += n;
        }
        return result;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double soma(double[] nums) {
        double result = 0;

        for (double n : nums) {
            result += n;
        }
        return result;
    }
}