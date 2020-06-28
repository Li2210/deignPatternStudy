package strategy;

public class EmailContact implements ContactStrategy {

    @Override
    public void send(){
        System.out.println("Use email to contact");
    }

}
