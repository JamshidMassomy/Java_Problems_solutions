public class DigitSplit {
    public static void Split(Integer digit){
        String s_digit = digit.toString();
        for(int d = 0; d<s_digit.length();d++){
            System.out.println(s_digit.charAt(d));
        }

        /*char[] c_digits = s_digit.toCharArray();
        for (int c =0; c<c_digits.length;c++){
            System.out.println(c_digits[c]);
        }*/
    }
}
