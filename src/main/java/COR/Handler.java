package COR;

public abstract class Handler {

    protected Handler successor = null;

    public abstract String handleRequest(int money);

    public Handler getSuccessor(){
        return successor;
    }

    public void setSuccessor(Handler next){
        this.successor = next;
    }

}
