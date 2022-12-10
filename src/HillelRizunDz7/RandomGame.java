package HillelRizunDz7;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Random rand = new Random();
        int randomInt = rand.nextInt(0, 10);
        System.out.println(randomInt);
        int count = 1;
        while (count < 4) {
            System.out.println("Please enter a number from 1 to 10");
            int enterInt = randomGame();
            if (enterInt == randomInt) {
                System.out.println("WINNER");
                break;
            } else {
                int differance = enterInt - randomInt;
                if (differance > 0) {
                    System.out.println("Probably less");
                }
                else {
                    System.out.println("Probably more");
                }
            }
            count++;
        }
        if (count == 4){
            System.out.println("You lose!");
        }

    }

    private static int randomGame() {
        Scanner scanner = new Scanner((System.in));
        int enterInt;
        boolean flag;
        do {
            flag = false;
            while (true) {
                if (scanner.hasNextInt()) {
                    enterInt = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Wrong input, only number from 1 to 10");
                    scanner.next();
                }
            }
            if (enterInt < 1 || enterInt > 10){
                System.out.println("Wrong input, only number from 1 to 10");
                flag = true;
            }
        } while (flag);
        return enterInt;
    }
}
