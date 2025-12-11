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



    //monthly Wage Calculation
    public static void monthlyWages(Employee e){
        int total_Working_Days=20;
        int monthlyWage=0;
        int hoursWorked=0;
        System.out.println("Employee Name :"+e.getName());

        for(int day=1;day<20;day++){
            String status= Attendance.isEmployeePresent(e);
            if(status.equalsIgnoreCase("Full-Time")){
                hoursWorked=8;
            }
            else if(status.equalsIgnoreCase("Absent")){
                hoursWorked=0;
            } else  {
                hoursWorked=4;
            }
            int dailywage= hoursWorked*wagePerHour;
            monthlyWage+=dailywage;
            System.out.println("Day : "+day+" Hours Worked :"+hoursWorked+" Today's Wage :"+dailywage+ " Total Till Now : "+monthlyWage);
            System.out.println("____________________________________________________________________________________________________________");
        }
        System.out.println("Total Monthly Wage is "+monthlyWage);

    }
}
