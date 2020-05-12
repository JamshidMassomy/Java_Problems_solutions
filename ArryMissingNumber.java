public class ArryMissingNumber {
    public static void Find(int[] Arr){
        int n = Arr.length+1;
        int _total = n*(n+1)/2;
        for(int i=0;i<Arr.length;i++){
            _total = _total - Arr[i];
        }
        System.out.println(_total);
    }
}
