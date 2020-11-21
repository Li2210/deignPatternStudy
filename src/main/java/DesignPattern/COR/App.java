package DesignPattern.COR;

public class App {
    public static void main(String[] args) {



        Handler h1 = new PhoneHandler();
        Handler h2 = new EmailHandler();
        Handler h3 = new TextHandler();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        String test1 = h1.handleRequest(50);
        System.out.println("test1 is: "+test1);

        String test2 = h1.handleRequest(250);
        System.out.println("test2 is: "+test2);

        String test3 = h1.handleRequest(450);
        System.out.println("test3 is: "+test3);

        String test4 = h1.handleRequest(850);
        System.out.println("test4 is: "+test4);
    }
}
