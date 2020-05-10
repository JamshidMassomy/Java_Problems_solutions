public class JavaEnvoCheck {
    public static  void Check(boolean check){
        Object val = System.getProperty("java.version");
        check=false;
        if(val !=null){
            check = true;
        }
        String abc = System.getProperty("java.version5");
        System.out.println(abc);
        if(abc == null){
            System.out.println("not installed");
        }else {
            System.out.println("installed");
        }
    }
}
