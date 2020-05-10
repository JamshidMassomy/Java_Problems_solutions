import java.util.Scanner;

public class DasyOfWeek {
    public static void Days(){
        String[] days ={"Sat","Sun", "Mond","Tus","Wed","Tha","Fri"};
        System.out.println("Enter a number to display the corsponding day");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        if(index>6 || index<0){
            System.out.println("invalid number");
            return;
        }else  {
            for(int i = 0;i <days.length;i++){
                if(days[index].equals(-1)){
                    System.out.println("it is a valid number");
                    return;
                }else{
                    System.out.println("Day is : " +days[index]);
                    return;
                }
            }

        }

    }
}
