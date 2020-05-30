import java.io.*;
import java.util.Scanner;

public class IOStream {

    public static void Read() throws IOException
    {
        String _FilePath = "C:\\GitHub\\Java\\Practices\\IOStreamFiles\\file5.txt";
        String _DefaultPath = "C:\\GitHub\\Java\\Practices\\IOStreamFiles\\file2.txt";
        String Content = "This line from String";
        File file = new File(_FilePath);
        if(file.exists()){
            OutputStream outputStream = new FileOutputStream(_FilePath);
            outputStream.write(Content.getBytes());
            outputStream.close();
        }else {
           // file.createNewFile(_DefaultPath);
        }
        //BufferedInputStream bufferedInputStream =
          //      new BufferedInputStream();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String[] GetDir(String _Path){
        File file = new File(_Path);
        String[] _list = file.list();
        for(String list:_list){
            System.out.println("files are :" +list);
        }
        return  _list;
    }
    public static void GetExtensions(String _Path){
        File file =new File(_Path);
        String[] name = file.list();
        for(String names:name){
            if(names.endsWith(".txt")){
                System.out.println(names); //text files only
            }else{
                System.out.println(names); // other type of files
            }

        }
    }
    public static void CopyContent(String Source,String Desination) throws IOException
    {
        try
        {
            InputStream in = new FileInputStream(Source);
            OutputStream out =new FileOutputStream(Desination);
            byte[] buffer = new byte[1024];
            while (in.read(buffer) != -1){
                out.write(buffer);
            }
            in.close();
            out.close();
        }catch (Exception ex){

        }
    }
    public static  void CopyConsoleContent(String path) throws  IOException
    {
        Scanner input =  new Scanner(System.in);
        String actualInput = input.nextLine();
        System.out.printf("input is :"+actualInput);
        //InputStream in = new FileInputStream(path);
        OutputStream out = new FileOutputStream(path);
        out.write(actualInput.getBytes());

    }
}
