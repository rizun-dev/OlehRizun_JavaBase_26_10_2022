package HillelRizunDz16;

public class Main {

//    Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//    Зробіть класи, які його імплементують: Androids, iPhones.
//    Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//    Створіть екземпляри кожного виду у мейн-класі

    public static void main(String[] args) {
        Androids android = new Androids();
        Iphones iPhone = new Iphones();

        android.call();
        android.internet();
        android.sms();
        android.linuxOSAction();

        System.out.println();

        iPhone.call();
        iPhone.internet();
        iPhone.sms();
        iPhone.IOSAction();
    }
}