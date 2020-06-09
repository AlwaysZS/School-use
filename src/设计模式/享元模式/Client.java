package 设计模式.享元模式;

public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteFactory("新闻");
        webSite1.use(new User("张三"));
        //客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteFactory("博客");
        webSite2.use(new User("李四"));
        //客户要一个以新闻形式发布的网站
        WebSite webSite3 = factory.getWebSiteFactory("博客");
        webSite3.use(new User("王五"));
        //客户要一个以新闻形式发布的网站
        WebSite webSite4 = factory.getWebSiteFactory("公众号");
        webSite4.use(new User("赵六"));
        System.out.println("网站的分类共："+factory.getWebSiteCount()+"个");
    }
}
