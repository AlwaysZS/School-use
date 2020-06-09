package 设计模式.访问者模式;

//1、这里用到了双分派，即首先在客户端程序中，将具体的状态作为参数传递到了woman中（第一次分派）
//2、然后woman类调用了作为参数的"具体方法"中方法getWomanResult，同时将自己（this）
//   作为参数传入，完成第二次的分派
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
