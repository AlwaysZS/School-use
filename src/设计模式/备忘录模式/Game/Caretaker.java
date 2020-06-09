package 设计模式.备忘录模式.Game;

//守护者对象，保存游戏角色的状态
public class Caretaker {
    //如果只保存一次状态
    private Memento memento;
    //对GameRole保存多次装填
    //private ArrayList<Memento> mementos;
    //对多个保存多次装填
    //private HashMap<String,ArrayList<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
