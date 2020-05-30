import java.io.*;
enum KeyWord
{
    Quite,
    Create,
    Update,
    Modify,
    Append,
    Write,
    Dir,
    List,
    Path
}
interface Methods
{
    void CreateFile(String Path) throws IOException;
    void DeleteFile(String Path) throws  IOException;
    void CopyFile(String Source, String Destination) throws  IOException;
    void AppendFile(String FilePath) throws  IOException;
    void ListDir(String Path) throws  IOException;
    void UpdateFile(String Path) throws  IOException;
    void ReadFile(String Path) throws IOException;
}
public class IOStreamApplicaiton implements Methods
{
    KeyWord keyWord;
    public  IOStreamApplicaiton (KeyWord _kewords){
        this.keyWord = _kewords;
    }
    public void App(){
        String[] method = new String[]{
                "CreateFile() ",
                "DeleteFile() "
        };
        String[] exceptions = new String[]{
                "throws IOException;"
        };
        String Exceptions = "throws IOException; ";
        for(String s:method){
            s.concat(Exceptions);
            System.out.println(s);
        }

    }
    public void App(String Path){};
    public void App(String Source, String Destination){}
    public void App(String Path, String Source,String Destination) throws IOException {
        System.out.println("Welcome to IO Stream App");
        for(KeyWord keyWord : KeyWord.values())
        {
            System.out.println(keyWord);
        }
        System.out.println("C: Create, Q: Quite , D: Delete U: Update");
        InputStreamReader in = new InputStreamReader(System.in);
        char App;
        try {
            do{
                switch (keyWord)
                {
                    case Quite:

                        break;
                    case Append:
                        AppendFile(Path);
                        break;
                    case Create:
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                App = (char) in.read();
            }while (App != 'Q');

        }catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public void CreateFile(String Path) throws IOException {
            InputStream in = new FileInputStream(Path);
    }

    @Override
    public void DeleteFile(String Path) {

    }

    @Override
    public void CopyFile(String Source, String Destination) {

    }

    @Override
    public void AppendFile(String FilePath) {

    }

    @Override
    public void ListDir(String Path) {

    }

    @Override
    public void UpdateFile(String Path) {

    }

    @Override
    public void ReadFile(String Path) {

    }
}
