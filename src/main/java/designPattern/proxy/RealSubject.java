package designPattern.proxy;


public class RealSubject implements subject {

    @Override
    public void play() {
        System.out.println("playing mobile games");
    }

}
