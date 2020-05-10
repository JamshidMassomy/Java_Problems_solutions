public class ArrySumOfTwo {
    public  void  Sum(int[] Arr, int Target){
        for(int v=0;v<Arr.length;v++){
            for(int x=0;x<v;x++){
                if(Arr[v] + Arr[x] == Target){
                    System.out.println("pair is "+Arr[v] +" , "+  Arr[x]);
                    return;
                }
            }
        }
    }
}
