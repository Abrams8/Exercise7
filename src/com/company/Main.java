package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 9;
        double b = 7;
        double r = 0;
        int checkR = 6;
        r = (Math.sqrt((a * a) + (b * b))) / 2;
        if (r <= checkR) {
            System.out.println("Картонка радиусом " + checkR + " полностью закроет отверстие.");
        } else {
            System.out.println("Картонка радиусом " + checkR + " не закроет отверстие.");
        }

    }
}
