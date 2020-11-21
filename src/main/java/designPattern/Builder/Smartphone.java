package designPattern.Builder;

public class Smartphone {

    private int CPU;
    private String screen;
    private String camera;
    private String os;
    private int speaker;

    public Smartphone(int CPU, String screen){
        this.CPU = CPU;
        this.screen = screen;
    }

    public void setCamera(String camera){
        this.camera = camera;
    }

    public void setOS(String os){
        this.os = os;
    }

    public void setSpeaker(int speaker){
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "smart phone{" +
                "cpu='" + CPU + '\'' +
                ", screen='" + screen + '\'' +
                ", camera=" + camera + '\'' +
                ", os='" + os + '\'' +
                ", speaker='" + speaker + '\'' +
                '}';
    }

}
