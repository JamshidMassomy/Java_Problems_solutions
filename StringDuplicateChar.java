public class StringDuplicateChar {
    public static void Check (String st){
        char[] chars =st.toCharArray();
        int counter = 0;
        for(int x =0;x<chars.length;x++){
            for(int y =x+1; y<chars.length;y++){
                if(chars[x] ==chars[y]){
                    counter++;
                    System.out.println("duplicate char is :" +chars[x]);
                }else{
                    System.out.println("Non Repeated Chars are :"+chars[x]);
                }
            }
        }
    }
}
