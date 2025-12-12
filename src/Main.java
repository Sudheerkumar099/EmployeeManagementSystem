public class Main {
    public static void main(String[] args) {
      EmpWageBuilder emp= new EmpWageBuilder(5);
      emp.addCompany("BridgeLabz",20,30,100);
        emp.addCompany("Tap",30,30,150);
        emp.computeEmpwages();
        emp.printAllCompanies();


    }
}