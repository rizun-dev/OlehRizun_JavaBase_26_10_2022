package HillelRizunDz11;

import java.util.Scanner;


    public class Matrix {
        public static void main(String[] args) {

//            Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//            Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] sourceMatrix = new int[x][y];
            int[][] transposedMatrix = new int[y][x];
            int numberFiller = 1;

            for (int i = 0; i < sourceMatrix.length; i++) {
                for (int j = 0; j < sourceMatrix[i].length; j++) {
                    sourceMatrix[i][j] = numberFiller++;
                    System.out.print(sourceMatrix[i][j] + " ");
                    while (true) {
                        if (scanner.hasNextInt()) {
                            sourceMatrix[i][j] = scanner.nextInt();
                            System.out.println(sourceMatrix[i][j]);
                            break;
                        } else {
                            System.out.println("Wrong date");
                            scanner.nextLine();
                        }
                    }
                }
                System.out.println();
            }

            for (int[] ints : sourceMatrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }

            for (int i = 0; i < sourceMatrix.length; i++) {
                for (int j = 0; j < sourceMatrix[i].length; j++) {
                    transposedMatrix[j][i] = sourceMatrix[i][j];
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








