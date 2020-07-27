package Observer;

import java.util.ArrayList;
import java.util.List;

public class GongZhongHao implements Subject {

    private List<Observer> WeChatUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        WeChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        WeChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : WeChatUserList){
            observer.update(message);
        }
    }
}
