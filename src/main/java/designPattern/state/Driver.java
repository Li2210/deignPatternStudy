package designPattern.state;

public class Driver {

    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();
        context.execute();
        //System.out.println(context.getState().toString());
    }

}
