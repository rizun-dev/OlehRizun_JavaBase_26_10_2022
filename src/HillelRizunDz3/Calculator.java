package HillelRizunDz3;
import java.util.Scanner;

    public class Calculator {

//        Встановити Git
//        Ініціалізувати репозиторій у папці з будь-яким файлом
//        Створити віддалений репозиторій та прив'язати його до локального. Назва репозиторію - "Ваше прізвище+курс+дата створення". Робіть його публічним
//        Запушити репозиторій у хмару
//        Внести зміни до локального репозиторії
//        Запушити зміни на хмару
        public static Scanner scanner = new Scanner(System.in);
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
                scanner.next();
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
                scanner.next();
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
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }
    }
