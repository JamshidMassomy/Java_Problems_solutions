public class ArryDuplicateNumber {
    public static void Find(int[] Arr){
        for(int z=0;z<Arr.length;z++){
            for(int x=1;x<z;x++){
                if(Arr[z] == Arr[x]){
                    System.out.println(" duplicate elements are :"+Arr[x]);
                    return;
                }
            }
        }
    }
}
