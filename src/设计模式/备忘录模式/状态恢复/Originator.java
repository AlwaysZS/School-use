package 设计模式.备忘录模式.状态恢复;

public class Originator {
    private String state;//状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，保存一个状态对象Memeto
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象恢复状态
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}
