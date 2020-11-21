package designPattern.Visitor;

public class App {

    public static void main(String[] args) {

        Lake lake = new Lake();

        Visitor Tom = new Tom();
        lake.accept(Tom);

        Visitor Jerry = new Jerry();
        lake.accept(Jerry);

    }

}
