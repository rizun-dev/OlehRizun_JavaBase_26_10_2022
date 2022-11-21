package HillelRizunDz3;
import java.util.Scanner;

    public class Calculator {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1,num2,operation);
            System.out.println("Result: "+result);
        }

        public static int getInt(){
            System.out.println("Write the number:");
            int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("Wrong action. Try again.");
                scanner.next();//рекурсия
                num = getInt();
            }
            return num;
        }

        public static char getOperation(){
            System.out.println("Write the operator:");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Wrong action. Try again.");
                scanner.next();//рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation){
            int result;
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    System.out.println("Operation not recognise. Try again");
                    result = calc(num1, num2, getOperation());//рекурсия
            }
            return result;
        }
    }
