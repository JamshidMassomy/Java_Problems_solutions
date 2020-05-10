public class ArryMissingNumber {
    public static void Find(int[] Arr){
        int checker = 0;
        for(int i=0;i<Arr.length;i++){
            checker++;
            if( checker != Arr[i] ){
                System.out.println("missing number is "+checker);
                return;
            }
        }
    }
}
