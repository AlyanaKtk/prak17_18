package prak18;
import java.util.Scanner;
public class num8
{
    public void getKey(String key) {
        try
        {
            printDetails(key);
        }
       catch (Exception e)
       {
           System.out.println("Exception: " + e.getMessage());
           Scanner sc = new Scanner(System.in);
           key = sc.next();
           getKey(key);
       }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }


    public static void main(String[] args) throws Exception {
        num8 test = new num8();
        test.getKey("");
    }
}
