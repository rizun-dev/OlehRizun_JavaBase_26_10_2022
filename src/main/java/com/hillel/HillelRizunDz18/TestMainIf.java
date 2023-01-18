package com.hillel.HillelRizunDz18;

public class TestMainIf {

//    1) Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
//    2) Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
//    3) В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу

    public double getAverageValue(int[] array) {

        double sum = 0;

        if (array == null){
            return 0.0;
        }

        for (double value : array){
            sum += value;


        } return sum;
    }

    public boolean isSquare(int[][] array ){

        double value = 0;

        if (array == null || array.length == 0) {
            return false;
        }

        for (int [] num : array) {
            if (num == null || num.length == 0) {
                return false;
            }
            value += num.length;
        }

        value = value / (double) array.length;
        return value == array.length;
    }
}