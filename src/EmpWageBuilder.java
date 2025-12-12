import jdk.internal.dynalink.beans.StaticClass;

import java.util.Random;

public class EmpWageBuilder {
    private static final int partTime=4;
     private static final int fullTime=4;
     private Company company;
     private Random random;
     public EmpWageBuilder(Company company,Random random){
         this.company=company;
         this.random=random;
     }

     public EmpWageBuilder(Company company){
         this(company,new Random());
     }

    public EmpWageBuilder() {
    }

    public int totalWageForCompany() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;
        System.out.println("Computig the total Wages for the Company " + company.getCompanyName());

        while (totalHours < company.getWorkingHours() && totalDays < company.getWorkingDays()) {
            totalDays++;
            int attendance = random.nextInt(3);
            int hoursWorked = 0;
            if (attendance == 0) {
                hoursWorked = 0;
                System.out.println("Day " + totalDays + " absent");
            } else if (attendance == 1) {
                hoursWorked = 8;
                System.out.println("Day " + totalDays + " Full-Time");
            } else {
                hoursWorked = 4;
                System.out.println("Day " + totalDays + " Part-Time");

            }
            int dailywage = hoursWorked * company.getWagePerHour();
            totalHours += hoursWorked;
            totalWage += dailywage;
            System.out.println("Hours Worked: " + hoursWorked + "| Daily wage " + dailywage + " |Total Hours:" + totalHours + " |Total Wage till Now :" + totalWage);
        }
        System.out.println("Total wage for the Company " + company.getCompanyName() + " is " + totalWage);
        company.setTotalWage(totalWage);
        company.addDailyWage(totalWage);
        return totalWage;
    }


}
