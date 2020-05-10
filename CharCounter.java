public class CharCounter {
    public static  void Counte(String _st){
        // char[] _chars = _st.toCharArray();
        int Letter =0;
        int Digits = 0;
        int Spaces =0;
        int Others = 0;
        for(int i= 0;i<_st.length();i++){
            char chars = _st.charAt(i);
            if(Character.isDigit(_st.charAt(i)) ){
                Digits++;
            }
            if(Character.isLetter(_st.charAt(i))  ){
                Letter++;
            }
            if(Character.isWhitespace(_st.charAt(i)));{
                Spaces++;
            }
            /*if (chars != ' '){
                Others++;
            }*/
        }
        System.out.println("Digits are " +Digits+ "Letters are :"+Letter+"Spaces are :"+Spaces);
    }
}
