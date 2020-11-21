package designPattern.COR;

public class TextHandler extends Handler {

    @Override
    public String handleRequest(int money) {

        String output = "no handler";

        if(money >= 300 && money <=500){
            output = "use text to handle this request";
        } else {
            if (getSuccessor() != null){
                return getSuccessor().handleRequest(money);
            }
        }
        return output;
    }

}
