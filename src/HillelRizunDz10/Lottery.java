package HillelRizunDz10;

import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) {

//        робити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//        Другий масив - це числа, які вгадав гравець.
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом;
//
//        Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//        [0, 1, 4, 5, 5, 8, 9]
//        [1, 1, 2, 3, 5, 6, 9]
//
//        Кількість збігів: 3

        int[] compNumber = {1, 2, 3, 4, 5, 6, 7};
        int[] humanNumber = new int [compNumber.length];
        int counterOfMatch = 0;


        for (int i = 0; i < compNumber.length; i++) {
            compNumber[i] = (int) (Math.random() * 9);
            for (int j = 0; j < humanNumber.length; j++) {
                humanNumber[j] = (int) (Math.random() * 9);
            }
        }

        System.out.println("Machine number");
            System.out.print(Arrays.toString(compNumber));
        System.out.println("\n" + "Player number");
            System.out.print(Arrays.toString(humanNumber));


        System.out.println("\n" + counterOfMatch);

    }
}
