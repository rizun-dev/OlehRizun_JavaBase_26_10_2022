package HillelRizunDz5;

public class ArmyPower {
    public static void main(String[] args) {
        int warrior = 13;
        int archers = 24;
        int riders = 46;

        int LiArmy = ((warrior + archers + riders)*860);
        System.out.println(LiArmy);


        int warrior1 = 9;
        int archers1 = 35;
        int riders1 = 12;
        int amountOfArmy = 860;
        double training = (860*1.5);
//        System.out.println(training);

        double MinArmy = ((warrior1 + archers1 + riders1)*training);
        System.out.println(MinArmy);
    }
}




