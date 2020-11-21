package designPattern.state;


public class Context {
    private State state;

    public Context() {
        state = new UpState();
    }

    public void execute() throws InterruptedException {
        this.state.observe();
       Thread.sleep(2000);
       if (state.getClass().equals(UpState.class)){
           changeStateTo(new StopState());
       }

       Thread.sleep(1000);
       if (state.getClass().equals(StopState.class)){
           changeStateTo(new DownState());
       }

       Thread.sleep(2000);
       if (state.getClass().equals(DownState.class)){
           changeStateTo(new StopState());
       }

       System.out.println("process over");
    }

    public void changeStateTo(State newState){
        this.state = newState;
        this.state.observe();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
