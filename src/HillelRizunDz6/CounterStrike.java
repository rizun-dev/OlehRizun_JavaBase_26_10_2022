package HillelRizunDz6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 Team name");
        String team1name = scanner.nextLine();
        System.out.println(team1name);

        System.out.println("Enter player 1 kills");
        int player1Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player1Team1);

        System.out.println("Enter player 2 kills");
        int player2Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player2Team1);

        System.out.println("Enter player 3 kills");
        int player3Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player3Team1);

        System.out.println("Enter player 4 kills");
        int player4Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player4Team1);

        System.out.println("Enter player 5 kills");
        int player5Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player5Team1);

        int team1result = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1)/5;


        System.out.println("Enter 2 Team name");
        String team2name = scanner.nextLine();
        System.out.println(team1name);

        System.out.println("Enter player 1 kills");
        int player1Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player1Team2);

        System.out.println("Enter player 2 kills");
        int player2Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player2Team2);

        System.out.println("Enter player 3 kills");
        int player3Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player3Team2);

        System.out.println("Enter player 4 kills");
        int player4Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player4Team2);

        System.out.println("Enter player 5 kills");
        int player5Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player5Team2);

        int team2result = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2)/5;


        if (team1result > team2result) {
            System.out.println("WIN TEAM " + team1name + " набрала " + team1result + " очків!");
        }
        else {
            System.out.println("WIN TEAM " + team2name + " набрала " + team2result + " очків!");
        }
    }
}
