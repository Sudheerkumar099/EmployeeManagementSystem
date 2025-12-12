public class Main {
    public static void main(String[] args) {
      EmpWageBuilder emp= new EmpWageBuilder();
      emp.addCompany("BridgeLabz",20,30,100);
        emp.addCompany("Tap",30,30,150);
        emp.computeEmpwages();
        String company = "BridgeLabz";
        int total = emp.getTotalWageByCompany(company);
        if (total != -1) {
            System.out.println("\nTotal Wage for " + company + ": " + total);
        } else {
            System.out.println("Company not found!");
        }



    }
}