package 设计模式.模板模式.钩子方法改进;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk redBean = new RedBean();
        redBean.make();
        System.out.println();
        System.out.println("制作花生豆浆");
        SoyaMilk peanut = new Peanut();
        peanut.make();
        System.out.println();
        System.out.println("制作纯豆浆");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
