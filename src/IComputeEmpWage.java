public interface IComputeEmpWage {
    public void addCompany(String name,int wagePerhour,int workingDays, int workingHours);
    public int totalWageForCompany(CompanyEmpWage company) ;
    public void computeEmpwages();
    public void printAllCompanies();


    }
