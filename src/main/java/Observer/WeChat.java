package Observer;

public class WeChat implements Observer {

    private String username;

    public WeChat(String username){
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username+" receive the message: "+message);
    }

}
