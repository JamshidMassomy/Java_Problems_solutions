import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public String toString(){
        return  ""+ "";
    }




    private static final  char Sap = 0x20;
    private static final int Mess_Type = 1;
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Serliziation_Deserlization se_de = new Serliziation_Deserlization();
        se_de.Serlize();
        se_de.Deserlize();



        /*IOStream ioStream = new IOStream();
        //ioStream.CopyConsoleContent("C:\\GitHub\\Java\\JavaCore\\IOStreamFiles\\file2.txt");

        Reader reader = new BufferedReader(new FileReader("C:\\GitHub\\Java\\JavaCore\\IOStreamFiles\\file1.txt"));
        while (((BufferedReader) reader).readLine() != null) {
            System.out.printf(reader.toString());
        }
        */



        //IOStreamApplicaiton ioStreamApplicaiton = new IOStreamApplicaiton();
       // ioStream.Read();
       // ioStream.GetExtensions("C:\\GitHub\\Java\\Practices\\IOStreamFiles");
       // ioStream.CopyContent("C:\\GitHub\\Java\\Practices\\IOStreamFiles\\file1.txt","C:\\GitHub\\Java\\Practices\\IOStreamFiles\\file2.txt");

        //IOCustomeConole ioCustomeConole = new IOCustomeConole();
        //ioCustomeConole.ReadConsole();
        // ioStream.GetDir("C:\\GitHub\\Java\\aws_demo");
        /*

        for(byte b =Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
            if (b == 0x90){
                System.out.println("we found out");
            }
        }*/
        //System.out.println(Sap+Mess_Type+"=A");

        //ArryMissingNumber arryMissingNumber = new ArryMissingNumber();
        //arryMissingNumber.Find((new int[]{1,2,4,5,6}));
        //MissingInteger missingInteger = new MissingInteger();
        //missingInteger.solution(new int[] {1,2,3,5,6});
        /*int a  =1;
        int b = a++;
        int c= ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
*/

        //int x =1<<2;
        //System.out.println(x);
        //max(10,20);

        /*final List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,5,2,3,7,3,8,9);
        final Integer pos = Integer.valueOf(3);
        list.remove(pos);
        System.out.println(list);
*/

    }
    void login(){
        System.out.println(Sap+Mess_Type + "A");
    }
    static int max(int a, int b){
        return (a>b)?a:b;
    }

}