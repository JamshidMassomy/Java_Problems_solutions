
/*
{1,2,3,4,5}
init index = 0;
int pvio = arr[leng/2];

 */
public class QuickSort {
   public int Parition(int[] Arr, int StartIndex, int EndIndex){
       int Pivot = Arr[Arr.length/2];
       StartIndex = 0;
       EndIndex = Arr.length-1;
       while (StartIndex<=EndIndex){
            for(int x=0;x<Arr.length;x++){
                if(Arr[x]<Pivot){
                    int temp = Arr[StartIndex];
                    Arr[StartIndex] = Arr[x];
                    Arr[x] =temp;
                    StartIndex++;
                    if(StartIndex ==5){
                        return 0;
                    }
                }
            }
           return 0;
       }
       return 0;

   }
   public void QuickSort(int[] arr, int  start, int  end){
       if(start<end){
           int pi = Parition(arr,start,end);
           QuickSort(arr, start, pi-1);
           QuickSort(arr, pi+1, end);
       }
   }
}
