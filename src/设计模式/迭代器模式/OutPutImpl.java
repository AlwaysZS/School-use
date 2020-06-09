package 设计模式.迭代器模式;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<College> collegeList;

    //学院集合
    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment，输出各个学院的系
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("------"+college.getName()+"------");
            printDepartment(college.createIterator());
        }
    }

    //输出学院，系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
