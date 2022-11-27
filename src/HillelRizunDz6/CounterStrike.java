package HillelRizunDz6;

public class CounterStrike {
    public static void main(String[] args) {

        String teamName1 = "Liones";

        int player1kills = 5;
        int player2kills = 7;
        int player3kills = 2;
        int player4kills = 8;
        int player5kills = 4;

        int resultFirstTeam = (player1kills + player2kills + player3kills + player4kills + player5kills)/5;

        String teamName2 = "Tigers";

        int player6kills = 7;
        int player7kills = 17;
        int player8kills = 20;
        int player9kills = 8;
        int player10kills = 12;

        int resultSecondTeam = (player6kills + player7kills + player8kills + player9kills + player10kills)/5;

        boolean resultWin = (resultFirstTeam < resultSecondTeam);

        System.out.println("Перемогла команда " + teamName2 + " набрала " + resultSecondTeam + " очків");
        System.out.println(resultWin);
    }
}
