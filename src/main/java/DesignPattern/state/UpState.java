package DesignPattern.state;

public class UpState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("This is up state");
        context.setState(this);
    }

    @Override
    public void observe(){
        System.out.println("elevator is up now");
    }

}

