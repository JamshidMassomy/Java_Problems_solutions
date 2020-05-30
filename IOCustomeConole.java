import java.io.IOException;
import java.io.InputStreamReader;

public class IOCustomeConole {
    public static void ReadConsole() throws IOException
    {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            System.out.println("Enter Q to quite");
            char c;
            do{
                c = (char) in.read();
                System.out.println("Running");
            }while (c!='Q');

        }catch (Exception e){

        }

    }
}


