package 设计模式.迭代器模式;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
