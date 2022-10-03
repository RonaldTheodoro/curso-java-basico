package com.loiane.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("i: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
        }

        int i = 0;
        for (; i > 0;) {
            System.out.println("i: " + i);
            i++;
        }

        int nums[] = {1,2,3,4,5,6,7,8,9};
        for (int n: nums) {
            System.out.println("n: " + n);
        }
    }
}