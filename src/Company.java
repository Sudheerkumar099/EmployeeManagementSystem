import java.util.*;

public class Company {
private  String companyName;
private int wagePerHour;
private  int workingDays;
private int WorkingHours;
private int totalWage;

public final List<Integer> dailyWages = new ArrayList<Integer>();

    public Company(String companyName, int wagePerHour, int workingDays, int WorkingHours) {
       this.companyName = companyName;
       this.wagePerHour= wagePerHour;
       this.workingDays=workingDays;
       this.WorkingHours=WorkingHours;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDays=" + workingDays +
                ", WorkingHours=" + WorkingHours +
                ", totalWage=" + totalWage +
                '}';
    }

    public  static int ComputeWageForCompany(String companyName, int wagePerHour, int workingDays, int workingHours ){

        Random random  = new Random();
        int totalHours = 0;
        int totalDays=0;
       int  totalWage=0;
       System.out.println("computing wages for "+companyName);
       while (totalHours<workingHours && totalDays<workingDays){
           totalDays++;
           int attendance= random.nextInt(3);
           int hoursWorked;
           if (attendance==0){
               hoursWorked=0;
               System.out.println("Day "+totalDays+" absent");
           }
           else if (attendance==1){
               hoursWorked=8;
               System.out.println("Day "+totalDays+" Full-Time");
           }
           else {
               hoursWorked = 4;
               System.out.println("Day " + totalDays + " Part-Time");

           }
           int dailywage=hoursWorked*wagePerHour;
           totalHours+=hoursWorked;
           totalWage+=dailywage;
           System.out.println("Hours Worked: "+hoursWorked + "| Daily wage "+dailywage+" |Total Hours:"+totalHours+" |Total Wage till Now :"+totalWage);
       }
        System.out.println("Total wage for the Company "+companyName +" is "+totalWage);
      return totalWage;
    }

    public void addDailyWage(int w){
        dailyWages.add(w);
    }







}



