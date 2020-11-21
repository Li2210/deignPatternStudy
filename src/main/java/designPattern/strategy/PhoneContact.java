package designPattern.strategy;

public class PhoneContact implements ContactStrategy {

    @Override
    public void send(){
        System.out.println("Use phone to contact");
    }

}
