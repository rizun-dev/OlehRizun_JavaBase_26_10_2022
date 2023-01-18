package com.hillel.HillelRizunDz4;

public class Paralelepiped {
    public static void main(String[]args) {

//        Паралелепіпед:
//
//        Створити у новому класі main-метод;
//        Створити три змінні для зберігання сторін паралелепіпеда;
//        Порахувати обсяг у змінній volume;
//        Вивести на екран змінну volume у вигляді:
//
//        System.out.println("Об'єм паралелепіпеда = " + volume);
//
//        Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
//
//        Прикріпити до LMS файл .java з вашою роботою;
//        Файл .java лежить за таким шляхом:
//        папка проекту -> src -> your_package_name -> MyApp.java
//        де MyApp - назва вашого класу/файлу

        int x = 5;
        int y = 7;
        int z = 4;

        int volume = (x * y * z);
        System.out.println("Обєм паралелепіпеда = " + volume);

        int x1 = 12;
        int y1 = 14;
        int z1 = 11;

        int length = ((x1 + y1 + z1)*4);
        System.out.println("Довжина всіх ребер паралелепіпеда = " + length);
    }
}
