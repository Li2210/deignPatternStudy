package designPattern.state;

public class StopState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("This is stop state");
        context.setState(this);
    }

    @Override
    public void observe(){
        System.out.println("elevator is stop now");
    }

}
