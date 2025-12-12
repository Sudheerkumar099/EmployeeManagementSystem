public class DailyRecord {
    private  int dayNumber;
    private int hoursWorked;
    private int dailyWage;

    DailyRecord(int daynumber, int hoursworked, int dailyWages){
        this.dayNumber=daynumber;
        this.hoursWorked=hoursworked;
        this.dailyWage=dailyWages;
    }
    public int getDayNumber(){
        return dayNumber;
    }

    public int getDailyWage() {
        return dailyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "DailyRecord{" +
                "dailyWage=" + dailyWage +
                ", dayNumber=" + dayNumber +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
