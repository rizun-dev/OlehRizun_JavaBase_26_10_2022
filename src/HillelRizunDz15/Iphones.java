package HillelRizunDz15;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone outgoing call...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone outgoing sms...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is checking your internet connection...");
    }

    @Override
    public void IOSAction() {
        System.out.println("iPhone do action under iOS");
    }
}