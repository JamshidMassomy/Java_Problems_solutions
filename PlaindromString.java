public class PlaindromString {
    public static  void  Check(String str){
        char[] OriginalString = str.toCharArray();
        char[] ReverseString =str.toCharArray();
        for(int x = ReverseString.length -1; x>=0 ;x--){
                System.out.print(ReverseString[x]);
        }

        /*if(new String(OriginalString) == new String(ReverseString)){
            System.out.println("Plaindrom ");
        }else{
            System.out.println("not Plaindrom ");
        }
        System.out.println("Orginial String is"+ new String(OriginalString));
        System.out.println("Rev String is"+ new String(ReverseString));*/
    }
}
