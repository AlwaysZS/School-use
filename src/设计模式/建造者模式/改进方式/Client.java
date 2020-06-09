package 设计模式.建造者模式.改进方式;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        Common common = new Common();
        //准备创建房子的指挥者
        Director director = new Director(common);
        //完成盖房子，返回产品
        House house = director.conductorHouse();
        System.out.println("--------------------");
        //盖摩天大楼
        Skyscraper skyscraper = new Skyscraper();
        director.setBuilder(skyscraper);
        director.conductorHouse();
    }
}
