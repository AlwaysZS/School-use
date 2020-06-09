package 设计模式.享元模式;

//具体网站
public class ConcretWebSite extends WebSite {
    //共享的部分，内部状态
    private String type = "";//网站的发布形式

    public ConcretWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"在使用中...使用者是："+user);
    }
}
