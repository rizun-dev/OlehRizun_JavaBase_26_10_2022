package HillelRizunDz6;

public class CounterStrike {
    public static void main(String[] args) {

        String teamName = "Liones";

        int player1kills1 = 5;
        int player1kills2 = 7;
        int player1kills3 = 2;
        int player1kills4 = 8;
        int player1kills5 = 4;

        int resultFirstTeam = (player1kills1 + player1kills2 + player1kills3 + player1kills4 + player1kills5)/5;

        String teamName1 = "Tigers";

        int player1kills6 = 7;
        int player1kills7 = 17;
        int player1kills8 = 20;
        int player1kills9 = 8;
        int player1kills10 = 12;

        int resultSecondTeam = (player1kills6 + player1kills7 + player1kills8 + player1kills9 + player1kills10)/5;

        boolean resultWin = (resultFirstTeam < resultSecondTeam);

        System.out.println("Перемогла команда " + teamName1 + " набрала " + resultSecondTeam + " очків");
        System.out.println(resultWin);





    }
}
