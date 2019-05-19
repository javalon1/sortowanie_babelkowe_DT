package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

public class App {
    //poczatek maina
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[20];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10001) - 5000;
        }
        System.out.println(Arrays.toString(tab));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Czas tworzenia tablicy: " + totalTime);
        System.out.println(sort(tab));
    }
    // koniec maina

    public static int[] sort(int[] tab) {
        long startTime = System.currentTimeMillis();
        int tmp = 0;
        int counter = 0;
        for (int j = 0; j < tab.length; j++) {
            boolean flaga = false;
            for (int i = 0; i < tab.length - j - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    //zamien miejscami
                    tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                    flaga = true;
                }
                counter++;
            }
            if(!flaga){
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Czas sortowania liczb: " + totalTime);
        System.out.println(Arrays.toString(tab));
        System.out.println("Ilość przebiegow petli: " + counter);
        return tab;
    }
}
