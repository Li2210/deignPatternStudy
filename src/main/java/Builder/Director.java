package Builder;

public class Director {

    public void buildPhone(Builder builder){
        builder.setCamera();
        builder.setOS();
        builder.setSpeaker();
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderOne = new XiaoMi(865, "1080p");
        director.buildPhone(builderOne);
        Smartphone smartphoneOne = builderOne.getSmartphone();
        System.out.println("Xiao Mi:" + smartphoneOne.toString());

        System.out.println("====================================");

        Builder builderTwo = new OPPO(865, "2k");
        director.buildPhone(builderTwo);
        Smartphone smartphoneTwo = builderTwo.getSmartphone();
        System.out.println("OPPO :" + smartphoneTwo.toString());
    }
}
