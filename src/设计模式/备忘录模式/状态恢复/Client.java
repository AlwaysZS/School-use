package 设计模式.备忘录模式.状态恢复;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1:生命值100%");
        //保存当前状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2:生命值80%");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3:生命值50%");

        caretaker.add(originator.saveStateMemento());
        System.out.println("当前状态是："+originator.getState());

        //恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前状态是："+originator.getState());

    }
}
