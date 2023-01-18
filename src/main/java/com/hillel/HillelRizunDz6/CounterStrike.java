package com.hillel.HillelRizunDz6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

//        1. ввести ім'я першої команди
//        2. ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
//        3. ввести ім'я другої команди
//        4. ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
//        5. підрахувати середнє арифметичне балів кожної команди
//        6. порівняти результати команд та визначити переможця
//        7. вивести у консоль:
//          "Перемогла команда" + teamName + "набрала" + result + "очків



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 Team name");
        String team1name = scanner.nextLine();
        System.out.println(team1name);

        System.out.println("Enter player 1 kills");
        double player1Team1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player1Team1);

        System.out.println("Enter player 2 kills");
        double player2Team1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player2Team1);

        System.out.println("Enter player 3 kills");
        double player3Team1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player3Team1);

        System.out.println("Enter player 4 kills");
        double player4Team1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player4Team1);

        System.out.println("Enter player 5 kills");
        double player5Team1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player5Team1);

        double team1result;
        team1result = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1)/5;


        System.out.println("Enter 2 Team name");
        String team2name = scanner.nextLine();
        System.out.println(team2name);

        System.out.println("Enter player 1 kills");
        double player1Team2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player1Team2);

        System.out.println("Enter player 2 kills");
        double player2Team2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player2Team2);

        System.out.println("Enter player 3 kills");
        double player3Team2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player3Team2);

        System.out.println("Enter player 4 kills");
        double player4Team2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player4Team2);

        System.out.println("Enter player 5 kills");
        double player5Team2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(player5Team2);

        double team2result;
        team2result = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2)/5;


        if (team1result > team2result) {
            System.out.println("WIN TEAM " + team1name + " набрала " + team1result + " очків!");
        }
        if (team1result == team2result) {
            System.out.println("Нічия!");
        }
        if (team2result > team1result){
            System.out.println("WIN TEAM " + team2name + " набрала " + team2result + " очків!");
        }
    }
}
