package 设计模式.适配器模式.接口适配器;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            public void m1() {
                System.out.println("m1");
            }
        };
        absAdapter.m1();
    }
}
