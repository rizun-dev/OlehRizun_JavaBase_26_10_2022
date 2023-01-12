package HillelRizunDz17;

public enum DrinksMachine {

    COFFEE("Coffee", Drinks.coffeePrice),
    TEA("Tea", Drinks.teaPrice),
    LEMONADE("Lemonade", Drinks.lemonadePrice),
    MOJITO("Mojito", Drinks.mojitoPrice),
    WATER("Mineral water", Drinks.waterPrice),
    COKE("Coca-cola", Drinks.cokePrice),
    PAY;

    String drink;
    int price;

    DrinksMachine(String drink, int price) {
        this.drink = drink;
        this.price = price;
    }

    DrinksMachine() {
    }
}