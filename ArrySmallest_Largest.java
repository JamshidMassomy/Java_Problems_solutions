public class ArrySmallest_Largest {
    public static  void Find(int[] Arr){
        int Max = Arr[0];
        int Min =Arr[0];
        for(int x=0;x<Arr.length;x++){
            if(Arr[x]>Max){
                Max = Arr[x];
            }
            if(Arr[x]<Min){
                Min =Arr[x];
            }
        }
        System.out.println("Min el "+Min);
        System.out.println("Max el :"+Max);
    }
}
