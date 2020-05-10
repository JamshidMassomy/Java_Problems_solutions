public class PenUltimateText {
    public static void Check(String T){
        String[] words = T.split(" ");
        int sen_lenght = words.length;
        System.out.println("PenUltimate text is :"+words[sen_lenght-2]);
    }
}
