import java.util.*;

public class Attendance {
    private int attendance;
    private static Random random = new Random();

    public static String isEmployeePresent(Employee e){
        int employee=e.getId();
        String status="";
        int temp = random.nextInt(3);
        switch (temp) {
            case 0:
                status="Absent";
                break;
                case 1:
            status = "Full-Time";
            break;

            default:
                status="Part-Time";
        }

       return status;
    }

}
