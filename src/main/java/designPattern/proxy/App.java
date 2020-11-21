package designPattern.proxy;

public class App {
    public static void main(String[] args) {
        subject real = new RealSubject();
        subject proxy = new ComputerProxy(real);
        proxy.play();
    }
}
