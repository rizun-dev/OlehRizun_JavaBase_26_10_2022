package HillelRizunDz17;

public class Drinks {
    public static final int coffeePrice = 70;
    public static final int teaPrice = 60;
    public static final int lemonadePrice = 50;
    public static final int mojitoPrice = 40;
    public static final int waterPrice = 30;
    public static final int cokePrice = 20;

    private static int Price;
    private static int drinksAmount;

    public void addToCart(String typeOfDrink, int cost) {
        drinksAmount++;
        Price += cost;
        System.out.println("Your drink is ready - " + typeOfDrink);
    }

    public static int getPrice() {
        return Price;
    }

    public static int getDrinksAmount() {
        return drinksAmount;
    }
}
