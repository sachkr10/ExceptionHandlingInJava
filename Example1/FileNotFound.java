import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        try{Scanner sc = new Scanner(new File("test.txt"));
    System.out.println(sc);}
        catch(FileNotFoundException ex)
        {
            System.out.println("CheckedException Example:"+ ex);
        }
        
    }
}
