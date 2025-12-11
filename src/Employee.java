import java.util.Random;

public class Employee {
    private String name;
    private int id;
    private String type;
    private int attendance;
    private static Random random = new Random();
    private static final int wagePerHour=20 ;
    private static int hoursPerDay=8;
    private static int partTimeHours=4;




    public Employee(String name,int id) {
        this.name = name;
        this .id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //methods
    public static String isEmployeePresent(Employee e){
        int employee=e.getId();
        String status="";
        int temp = random.nextInt(3);
        switch (temp) {
            case 0:
                status="Absent";
                break;
            case 1:
                status = "Full-Time";
                break;

            default:
                status="Part-Time";
        }

        return status;
    }

    //Comuting till20days
    public static void computeTill(Employee e){
        int total_Working_Days=20;
        int totalWage=0;
        int hoursWorked=0;
        int maxHours=100;
        int totalHoursWorked=0;
        System.out.println("Employee Name :"+e.getName());

        for(int day=1;day<=20 && totalHoursWorked<=maxHours;day++){
            String status= Employee.isEmployeePresent(e);
            if(status.equalsIgnoreCase("Full-Time")){
                hoursWorked=8;
            }
            else if(status.equalsIgnoreCase("Absent")){
                hoursWorked=0;
            } else  {
                hoursWorked=4;
            }
            int dailywage= hoursWorked*wagePerHour;
            totalWage+=dailywage;
            totalHoursWorked+=hoursWorked;
            System.out.println("Day : "+day+" Hours Worked :"+hoursWorked+" Today's Wage :"+dailywage+ " Total Till Now : "+totalWage);
            System.out.println("____________________________________________________________________________________________________________");
        }
        System.out.println("Total Monthly Wage is "+totalWage +" and total hours worked is "+totalHoursWorked+" Hours");
    }


    //monthlywagecalculator
    public static void monthlyWages(Employee e){
        int total_Working_Days=20;
        int monthlyWage=0;
        int hoursWorked=0;
        System.out.println("Employee Name :"+e.getName());

        for(int day=1;day<=20;day++){
            String status= Employee.isEmployeePresent(e);
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


    //dailyWageCalculator
    public static void dailyWageByAttendance(Employee e){
        if(Employee.isEmployeePresent(e).equalsIgnoreCase("Absent")) {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Absent");
            hoursPerDay=0;
            System.out.println("Hours Worked : 0");
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }
        else if(Employee.isEmployeePresent(e).equalsIgnoreCase("Full-Time")){
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Full-Time");
            System.out.println("Hours Worked : "+hoursPerDay);
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*hoursPerDay);
        }
        else {
            System.out.println("Employee :" + e.getName());
            System.out.println("Attendance : Part-Time");
            System.out.println("Hours Worked : "+partTimeHours);
            System.out.println("Wage Per Hour :"+ wagePerHour);
            System.out.println("Daily wage: "+ wagePerHour*partTimeHours);
        }

    }







}
