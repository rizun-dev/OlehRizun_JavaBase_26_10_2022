package HillelRizunDz16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android outgoing call...");
    }

    @Override
    public void sms() {
        System.out.println("Android outgoing sms...");
    }

    @Override
    public void internet() {
        System.out.println("Android is checking your internet connection...");
    }

    @Override
    public void linuxOSAction() {
        System.out.println("Android do action under LinuxOS");
    }
}