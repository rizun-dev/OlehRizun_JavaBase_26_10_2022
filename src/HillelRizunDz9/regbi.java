package HillelRizunDz9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class regbi {

    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.


        int[] team1 = new int [25];
        int[] team2 = new int[team1.length];
        int sum = 0;
        int sum1 = 0;
        double total = 0;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 22 + 18);
            total = sum += team1[i];
            total1 = total / team1.length;
        }
        System.out.println("\n" + "Team1");
        System.out.print(Arrays.toString(team1));
        System.out.println("\n" + total);
        System.out.println(total1);

        for (int j = 0; j < team2.length; j++) {
            team2[j] = (int) (Math.random() * 22 + 18);
        total2 = sum1 += team1[j];
        total3 = total2 / team1.length;
        }
        System.out.println("\n" + "Team2");
        System.out.print(Arrays.toString(team2));
        System.out.println("\n" + total2);
        System.out.println(total3);
    }
}


