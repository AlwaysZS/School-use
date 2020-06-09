package 设计模式.备忘录模式.Game;

public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("大战前的状态是");
        gameRole.display();

        //保存当前状态到Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("Boss战后");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("大战后恢复状态");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();

    }
}
