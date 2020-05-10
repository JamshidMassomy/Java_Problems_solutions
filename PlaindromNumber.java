public class PlaindromNumber {
    public void Check(int Number){
        int OriginalNumber = Number;
        int ReversNumber = 0;
        while (Number !=0){
           int Remainder =  Number%10;
           ReversNumber = ReversNumber*10 +Remainder ;
           Number= Number/10;
        }
        if(OriginalNumber == ReversNumber){
            System.out.println("Number is Plaindrom");
        }else{
            System.out.println("Not Plaindrom");
            System.out.println("Rev Number is :"+ReversNumber);
        }


    }
}
