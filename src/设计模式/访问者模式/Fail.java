package 设计模式.访问者模式;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价改歌手很失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价改歌手很失败");
    }
}
