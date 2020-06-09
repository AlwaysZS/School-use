package 设计模式.外观模式;

public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();
    public static TheaterLight getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("TheaterLight up");
    }

    public void down(){
        System.out.println("TheaterLight down");
    }

}
