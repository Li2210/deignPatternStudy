package DesignPattern.Observer;

public class App {
    public static void main(String[] args) {

        WeChat user1 = new WeChat("Tom");
        WeChat user2 = new WeChat("jerry");
        WeChat user3 = new WeChat("Alice");

        GongZhongHao music = new GongZhongHao();
        music.attach(user1);
        music.attach(user2);
        music.notify("new album is released");

        GongZhongHao cook = new GongZhongHao();
        cook.attach(user3);
        cook.notify("new dish");

    }
}
