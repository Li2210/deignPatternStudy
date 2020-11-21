package DesignPattern.strategy;

public class User {

    private ContactStrategy strategy;

    public User(ContactStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(ContactStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.send();
    }

}
