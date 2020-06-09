package 设计模式.访问者模式;

import java.util.LinkedList;
import java.util.List;

//数据结构，管理很多人
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attach(Person p){
        persons.add(p);
    }

    //删除
    public void detach(Person p){
        persons.remove(p);
    }
    
    //显示测评情况
    public void display(Action action){
        for (Person p:persons) {
            p.accept(action);
        }
    }
}
