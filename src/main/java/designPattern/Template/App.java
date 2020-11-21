package designPattern.Template;

public class App {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.createPhone();
        System.out.println("--------------------");
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.createPhone();

    }

}
