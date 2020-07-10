package Adapter;

/**
 * use typeC to charge iphone
 */
public class App {


    public static void main(String[] args) {

        TypeC typeC = new PortAdapter(new Iphone());
        typeC.typeCPort();

    }
}
