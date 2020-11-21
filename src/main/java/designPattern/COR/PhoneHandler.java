package designPattern.COR;

public class PhoneHandler extends Handler {

   @Override
    public String handleRequest(int money) {

        String output = "no handler";

        if(money <= 100){
            output = "use phone to handle this request";
        } else {
            if (getSuccessor() != null){
                return getSuccessor().handleRequest(money);
            }
        }
        return output;
    }

}
