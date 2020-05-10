import java.util.Scanner;

public class LeapYear {
    public static void Check(int year){
        Scanner _yr = new Scanner(System.in);
        year = _yr.nextInt();
        if(year%4 ==0 && year%100 !=0){
            System.out.println("Leap Year !");
            return;
        }else{
            System.out.println("Not Leap Year!");
        }
    }
}
