package 设计模式.访问者模式;

public abstract class Action {
    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女性的测评
    public abstract void getWomanResult(Woman woman);

}
