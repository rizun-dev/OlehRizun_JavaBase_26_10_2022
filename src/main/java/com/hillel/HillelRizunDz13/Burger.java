package com.hillel.HillelRizunDz13;

public class Burger {

//    Main - Зробити клас Burger, який матиме поля:
//    булочка, м'ясо, сир, зелень, майонез

//        1. Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
//          а)звичайний бургер (усі компоненти)
//          б)дієтичний бургер (без майонезу)
//          в)з подвійним м'ясом
//        2. У кожен конструктор додати виведення в консоль складу даного варіанту бургера (при створенні екземпляра бургера,
//        який використовує даний конструктор - буде виводитися в консоль його склад).
//        3. Зробити клас BurgerMain, в якому створити три різні бургери. Їхній склад буде автоматично виводитися на екран під час запуску програми.

    static String bun = "bun";
    static String meat = "meat";
    static String cheese = "cheese";
    static String salad = "salad";
    static String mayonnaise = "mayonnaise";
    static String secondMeat = "second meat";

    public static void main(String[] args) {
        BurgerClass classicMac = new BurgerClass(bun, meat, cheese, salad, mayonnaise);
        BurgerClass noMayonnaiseMac = new BurgerClass(bun, meat, cheese, salad);
        BurgerClass doubleMac = new BurgerClass(bun, meat, cheese, salad, mayonnaise, secondMeat);
    }
}