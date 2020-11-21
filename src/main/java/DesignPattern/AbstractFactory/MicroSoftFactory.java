package DesignPattern.AbstractFactory;

public class MicroSoftFactory implements AbstractFactory {

    public Game playGame() {
        return new MicroSoftGame();
    }

    public Machine buyMachine(){
        return new MicroSoftMachine();
    }

    public Membership buyMembership(){
        return new MicroSoftMembership();
    }

}
