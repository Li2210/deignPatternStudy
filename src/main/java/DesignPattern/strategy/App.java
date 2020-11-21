package DesignPattern.strategy;

public class App {

    public static void main(String[] args) {
        User user = new User(new PhoneContact());
        user.executeStrategy();
        System.out.println("----------------");
        user.changeStrategy(new EmailContact());
        user.executeStrategy();
        System.out.println("-----------------");
        user.changeStrategy(new WeChatContact());
        user.executeStrategy();
    }

}
