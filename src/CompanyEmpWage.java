import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
    private String companyName;
    int wagePerhour;
    private int workingDays;
    private int workingHours;

    private int totalWage;
    private final List<Integer> dailyWages=new ArrayList<>();


    public CompanyEmpWage(String name,int wagePerhour,int workingHours,int workingDays) {
        this.companyName = name;
        this.wagePerhour=wagePerhour;
        this.workingHours=workingHours;
        this.workingDays=workingDays;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerhour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public List<Integer> getDailyWages() {
        return new ArrayList<>(dailyWages);
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                ", name='" + companyName + '\'' +
                ", wagePerhour=" + wagePerhour +
                ", workingDays=" + workingDays +
                ", workingHours=" + workingHours +
                ", totalWage=" + totalWage +
                '}';
    }
}
