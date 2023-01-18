package com.hillel.HillelRizunDz5;

public class ArmyPower {
    public static void main(String[] args) {

//        За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
//        З кожного боку боролися 3 типи воїнів з такими показниками атаки:
//
//        Лі:
//        воїн - 13
//        лучник - 24
//        вершник - 46
//
//        Мінь:
//        воїн - 9
//        лучник - 35
//        вершник - 12

//        Розрахувати: загальний показник атаки для обох династій, якщо відомо,
//        що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь кожного типу в півтора рази більша.
//
//        Вивести в консоль значення загальної атаки кожної армії;


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

        double MinArmy = ((warrior1 + archers1 + riders1)*training);
        System.out.println(MinArmy);
    }
}




