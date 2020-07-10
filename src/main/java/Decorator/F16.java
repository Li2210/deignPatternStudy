package Decorator;

public class F16 implements Fighter {

    @Override
    public void speed() {
        System.out.println("The speed is 2500km/h");
    }

    @Override
    public void attack() {
        System.out.println("Attack with gun");
    }
}
