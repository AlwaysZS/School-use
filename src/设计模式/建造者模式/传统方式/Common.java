package 设计模式.建造者模式.传统方式;

public class Common extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("平房打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("平房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("平房封顶");
    }
}
