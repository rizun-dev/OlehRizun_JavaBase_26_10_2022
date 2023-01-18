package com.hillel.Dz9V2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int[] team1 = getRandomArr();
        int[] team2 = getRandomArr();
        double sum1 = getCount(team1);
        double sum2 = getCount(team2);
        printTeam(team1 , sum1);
        printTeam(team2 , sum2);
    }

    public static int[] getRandomArr() {
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 22 + 18);
        }
        return arr;
    }

    public static double getCount(int[] arr) {
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    public static void printTeam(int[] arr, double count) {
        System.out.println("\n" + "Team2");
        System.out.print(Arrays.toString(arr));
        System.out.println("\n" + count);
        System.out.println(count / arr.length);
    }
}
