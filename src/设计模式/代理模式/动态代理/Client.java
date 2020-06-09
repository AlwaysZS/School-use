package 设计模式.代理模式.动态代理;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //proxyInstance = class com.sun.proxy.$Proxy0内存中动态生成了代理对象
        System.out.println("proxyInstance="+proxyInstance.getClass());
        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
    }
}
