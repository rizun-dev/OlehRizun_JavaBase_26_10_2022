package HillelRizunDz7;

public class Shuttle {

    public static void main(String[] args) {

        int counter = 0;
        int number = 0;
        boolean flag;
        while (counter < 101) {
            flag = true;
            String[] arr = String.valueOf(number).split("");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("4") || arr[i].equals("9")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
                System.out.println("counter of shuttle " + counter);
                counter++;
            }
            number++;
        }
    }
}


