package COR;

public class EmailHandler extends Handler {

    @Override
    public String handleRequest(int money) {

        String output = "no handler";

        if(100 < money && money < 300){
            output = "use email to handle this request";
        } else {
            if (getSuccessor() != null){
                return getSuccessor().handleRequest(money);
            }
        }
        return output;
    }

}
