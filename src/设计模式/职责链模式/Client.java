package 设计模式.职责链模式;

public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("赵主任");
        CollegeApprover collegeApprover = new CollegeApprover("赵院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("赵副院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("赵校长");

        //需要将各个审批级别的下一个人设置好(处理人构成环形：)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
