public class ArryCentered {
    public static void Check(Integer[] arr){

        int mid_el = arr.length/2;
        System.out.println("arry lengt is :"+ arr.length);
        System.out.println("mid el  is :"+ arr[mid_el]);
        for(int i=0;i<=arr.length;i++){
            if(arr.length%2 ==0 || arr.length ==0 ){
                System.out.println("Elements are not odd :0: no middle element");

            }if(arr.length ==1){
                System.out.println("middle el is :"+arr[0]);
            }
            if(arr[mid_el] < arr[i]){
                System.out.println("cenered array :"+arr[mid_el]);
            }
            /*
            if(arr[mid_el] < arr[i]){
                System.out.println("Arry is centered :1:");
            }*/
        }
    }
}
