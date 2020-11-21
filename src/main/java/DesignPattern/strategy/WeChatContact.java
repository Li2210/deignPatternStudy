package DesignPattern.strategy;

public class WeChatContact implements ContactStrategy{

    @Override
    public void send(){
        System.out.println("Use WeChat to contact");
    }

}
