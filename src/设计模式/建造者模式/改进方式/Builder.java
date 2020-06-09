package 设计模式.建造者模式.改进方式;

public abstract class Builder {
    protected House house = new House();

    //建造流程的抽象方法
    public abstract void buildGround();

    public abstract void buildWall();

    public abstract void buildRoof();

    //盖好房子后将产品返回
    public House buildHouse(){
        return house;
    }
}

