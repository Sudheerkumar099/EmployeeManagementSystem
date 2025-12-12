//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static Attendance attendance = new Attendance();
    public static void main(String[] args) {

//Employee e= new Employee("sudheer",142);
//      Employee.dailyWageByAttendance(e);
//        Employee.monthlyWages(e);
//        Employee.computeTill(e);
//        System.out.println(Employee.isEmployeePresent(e));

       Company c1 = new Company("BrigdeLabz",20,20,100);
        Company c2= new Company("Tap",30,23,200);
        EmpWageBuilder e1= new EmpWageBuilder(c1);
        EmpWageBuilder e2= new EmpWageBuilder(c2);
        e2.totalWageForCompany();




    }
}