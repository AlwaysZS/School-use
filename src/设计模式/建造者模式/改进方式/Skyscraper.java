package 设计模式.建造者模式.改进方式;

public class Skyscraper extends Builder{
    private String type = "摩天大楼";
    private int standard = 100;

    @Override
    public void buildGround() {
        System.out.println(type+"打地基"+standard+"米");
    }

    @Override
    public void buildWall() {
        System.out.println(type+"砌墙"+standard+"厘米");
    }

    @Override
    public void buildRoof() {
        System.out.println(type+"盖屋顶"+standard+"平方米");
    }
}
