import java.io.*;
import java.util.Date;

public class Serliziation_Deserlization {

    public static void Serlize() throws IOException
    {
        Entities object= new Entities(1,"abc",new Date(),23.2);
        OutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\GitHub\\Java\\JavaCore\\IOStreamFiles\\file1.txt"));
        ((ObjectOutputStream) out).writeObject(object);
        out.close();

    }
    public static void Deserlize() throws ClassNotFoundException
    {
        Entities obj = null;
        try {
            InputStream in = new ObjectInputStream(new FileInputStream("C:\\GitHub\\Java\\JavaCore\\IOStreamFiles\\file1.txt"));
            obj=(Entities) ((ObjectInputStream) in).readObject();
            in.close();
            System.out.println(obj.getCode());
            System.out.println(obj.getId());
            System.out.println(obj.getSalary());
            System.out.println(obj.getRegisterDate());
        }catch (IOException ex){
            System.out.println(ex);
        }


    }
}
