import java.util.*;

public class Attendance {
    private int attendance;
    private Random random = new Random();

    public void isEmployeePresent(Employee e){
        int employee=e.getId();
        int temp = random.nextInt(2);
       if(temp==1){
           System.out.println(e.getName()+" is Present");
       }
       else {
           System.out.println(e.getName()+" is Absent");

       }
    }

}
