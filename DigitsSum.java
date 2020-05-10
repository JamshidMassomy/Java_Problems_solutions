public class DigitsSum {
    public static void Sum(int num){
        String _st = String.valueOf(num);
        int sum = 0;
        char[] _digits = _st.toCharArray();
        for(int c = 0;c<_digits.length;c++){
            sum = sum+Character.getNumericValue(_digits[c]);
        }
        System.out.println("sum of digits is : " +sum);
    }
}
