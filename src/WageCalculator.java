public class WageCalculator {
    private final int wagePerHour=20 ;
    private int hoursPerDay=8;

    public void dailyWageByAttendance(Employee e){
        if(Attendance.isEmployeePresent(e)==0) {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Absent");
            hoursPerDay=0;
            System.out.println("Hours Worked : 0");
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }
        else {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Present");
            System.out.println("Hours Worked : "+hoursPerDay);
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }

    }
}
