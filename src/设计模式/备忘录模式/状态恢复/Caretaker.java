package 设计模式.备忘录模式.状态恢复;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
