public class WageCalculator {
    private static final int wagePerHour=20 ;
    private static int hoursPerDay=8;
    private static int partTimeHours=4;

    public static void dailyWageByAttendance(Employee e){
        if(Attendance.isEmployeePresent(e).equalsIgnoreCase("Absent")) {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Absent");
            hoursPerDay=0;
            System.out.println("Hours Worked : 0");
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }
        else if(Attendance.isEmployeePresent(e).equalsIgnoreCase("Full-Time")){
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Full-Time");
            System.out.println("Hours Worked : "+hoursPerDay);
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }
        else {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Part-Time");
            System.out.println("Hours Worked : "+hoursPerDay);
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*partTimeHours);
        }
    }
}
