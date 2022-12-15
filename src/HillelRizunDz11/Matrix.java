package HillelRizunDz11;

import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {

//            Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//            Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Entered matrix size");

        while (true) {
            System.out.print("x = ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong date");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("y = ");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong date");
                scanner.next();
            }
        }

        int[][] mainMatrix = new int[x][y];
        int[][] transposedMatrix = new int[y][x];
        int numberFiller = 1;

        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix[i].length; j++) {
                mainMatrix[i][j] = numberFiller++;
                while (true) {
                    System.out.print("Input number : ");
                    if (scanner.hasNextInt()) {
                        mainMatrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Wrong date");
                        scanner.next();
                    }
                }
            }
            System.out.println();
        }

        for (int[] ints : mainMatrix) {
            for (int i : ints) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix[i].length; j++) {
                transposedMatrix[j][i] = mainMatrix[i][j];
            }
            System.out.println();
        }

        for (int[] matrix : transposedMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}