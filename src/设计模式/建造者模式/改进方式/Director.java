package 设计模式.建造者模式.改进方式;

public class Director {
    Builder builder = null;

    //两种方法
    //构造器传入builder
    public Director(Builder builder){
        this.builder = builder;
    }

    //setter传入builder
    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    //如何处理建造房子的过程，交给指挥者
    public House conductorHouse(){
        builder.buildGround();
        builder.buildWall();
        builder.buildWall();
        return builder.buildHouse();
    }
}
