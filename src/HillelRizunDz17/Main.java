package HillelRizunDz17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
//#2 Зробіть клас Drinks, де константами задайте ціну напою;
//#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;
//#4 Зробіть спосіб приготування кожного напою;
//#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;
//#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;
//#7 Користувач повинен мати можливість замовити кілька напоїв
//#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;

    public static void main(String[] args) {
        makeOrder();
    }

    private static void makeOrder() {

        Scanner input = new Scanner(System.in);
        DrinksMachine[] drinks = DrinksMachine.values();
        DrinksMachine userDrink ;
        String userInput;
        Drinks cart = new Drinks();

        do {
            System.out.println();
            System.out.println("Choose your drink from the menu: " + Arrays.toString(drinks));
            System.out.println("Please type /Pay/ to get you receipt ");

            while (true) {

                userInput = input.nextLine().toUpperCase();
                userDrink = null;
                for (DrinksMachine drink : drinks) {
                    if (drink.toString().equals(userInput)) {
                        userDrink = DrinksMachine.valueOf(userInput);
                        break;
                    }
                }
                if (userDrink != null) {
                    break;
                }
                System.out.println("Please try again!");
            }

            switch (userDrink) {
                case COFFEE, TEA, LEMONADE, MOJITO, WATER, COKE -> cart.addToCart(userDrink.drink, userDrink.price);
                case PAY -> {
                    if (Drinks.getDrinksAmount() == 0) {
                        System.out.println("Please order something!");
                        userInput = "";
                    } else {
                        System.out.println("Number of drinks: " + Drinks.getDrinksAmount() + "\n" + "To pay - " + Drinks.getPrice() + " grn");
                    }
                }
            }
        } while (!userInput.equals("PAY"));
    }
}