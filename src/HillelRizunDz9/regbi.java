package HillelRizunDz9;

import java.util.Arrays;

public class regbi {

    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.


        int[] team1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int[] team2 = new int[team1.length];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 22 + 18);
            for (int j = 0; j < team2.length; j++) {
                team2[j] = (int) (Math.random() * 22 + 18);
                team1[i] = team2 [j];
            }
        }
        System.out.println("Team1");
        System.out.print(Arrays.toString(team1));


        System.out.println("\n" + "Team2");
        System.out.print(Arrays.toString(team2));


    }
}


