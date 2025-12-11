//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static Attendance attendance = new Attendance();
    public static void main(String[] args) {

Employee e= new Employee("sudheer",142);
//        System.out.println(Attendance.isEmployeePresent(e));
//      WageCalculator.dailyWageByAttendance(e);
        WageCalculator.monthlyWages(e);
    }
}