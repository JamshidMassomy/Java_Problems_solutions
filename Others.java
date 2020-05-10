public class Others {
    public static void ArryOps(String text, String t_text){
        /*
        array copy
        //arr[arr.length] = targetArr[targetArr.length];
        //arr = targetArr;
        //targetArr =arr.clone();
        */

        /*
        custom arry insertion

         */
        Integer[] arry_1 = {50 , 20, 0};
        Integer[] arry_2 = {5, -50, 10};
        Integer[] arr_new= {arry_1[0], arry_2[2]};


        String[] firstArray = text.split(" ");
        String[] secondArray = new String[firstArray.length+1];
        for(int c =0; c<secondArray.length;c++){
            if(c<(secondArray.length-1)%2){
                secondArray[c] =firstArray[c];
            }
            else if(c==secondArray.length%2){
                secondArray[c] =t_text;
            }else{
                secondArray[c] = firstArray[c-1];
            }
            System.out.println(secondArray[c]);
        }

    }
}
