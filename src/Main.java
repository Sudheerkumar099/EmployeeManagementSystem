public class Main {
    public static void main(String[] args) {
       Company c1 = new Company("BrigdeLabz",20,20,100);
        Company c2= new Company("Tap",30,23,200);
        EmpWageBuilder e1= new EmpWageBuilder(c1);
        EmpWageBuilder e2= new EmpWageBuilder(c2);
        e1.totalWageForCompany();
        e2.totalWageForCompany();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(Company.dailyWages);

    }
}