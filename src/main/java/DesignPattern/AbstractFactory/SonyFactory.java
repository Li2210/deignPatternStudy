package DesignPattern.AbstractFactory;

public class SonyFactory implements AbstractFactory {

    public Game playGame() {
        return new SonyGame();
    }

    public Machine buyMachine(){
        return new SonyMachine();
    }

    public Membership buyMembership(){
        return new SonyMembership();
    }

}
