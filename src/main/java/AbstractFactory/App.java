package AbstractFactory;

import javax.crypto.Mac;

public class App {

    public static void main(String[] args) {
        AbstractFactory factory = new SonyFactory();
        Game game = factory.playGame();
        Machine machine = factory.buyMachine();
        Membership membership = factory.buyMembership();

        game.game();
        machine.machineName();
        membership.membershipName();
    }

}
