package 设计模式.模板模式.钩子方法改进;

public class PureSoyaMilk extends SoyaMilk {
    //纯豆浆，不加配料
    @Override
    void add() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
