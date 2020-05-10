public class Lower_Upper_Case {
    public static  void  ConvertToUpperCase(String _St){
        char[] sentence = _St.toCharArray();
        for(int i =0; i<_St.length();i++){
            sentence[0] = Character.toUpperCase(sentence[0]);
            if(Character.isWhitespace(sentence[i])){

                sentence[i+1] = Character.toUpperCase(sentence[i+1]);
            }
            System.out.println(sentence[i]);
        }
    }
    public static void  ConvertToLowerCase(String _st){
        for(int b=0;b<_st.length();b++){
            System.out.println(_st.toLowerCase());
        }
    }
}
