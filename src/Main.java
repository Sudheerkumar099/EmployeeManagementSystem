public class Main {
    public static void main(String[] args) {
      EmpWageBuilder emp= new EmpWageBuilder();
      emp.addCompany("BridgeLabz",20,30,100);
        emp.addCompany("Tap",30,30,150);
        emp.computeEmpwages();
        emp.printAllCompanies();





        CompanyEmpWage comp = emp.getCompanyEmpWage("BridgeLabz");
        if (comp != null) {
            System.out.println("\nDaily Records for " + "BridgeLabz" + ":");
            for (DailyRecord dr : comp.getDailyRecords()) {
                System.out.println(dr);
            }
        } else {
            System.out.println("Company not found!");
        }



    }
}