package DesignPattern.Decorator;

public class App {
    public static void main(String[] args) {
        Fighter f16 = new F16();
        f16.speed();
        f16.attack();
        System.out.println("=================");
        Fighter f16v = new missile(f16);
        f16v.speed();
        f16v.attack();
        System.out.println("=================");
        Stealth f22 = new Stealth(f16v);
        f22.speed();
        f22.attack();
        f22.protect();
    }
}
