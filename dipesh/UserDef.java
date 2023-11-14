package dipesh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserDef {
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("Your file path here");
    }
    void saveFile() throws FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("Your file path here");
    }
}
class Test
{
    public static void main(String[] args) {
        UserDef ud = new UserDef();
        try{
            ud.readFile();
        }
        catch(Exception e){
            System.out.println("File not found " + e.getMessage());
        }
    }
}
