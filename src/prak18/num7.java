package prak18;
import java.util.*;
public class num7
{
    public void getKey(String key) {

        printDetails( key );
    }
    public void printDetails(String key)
    {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch ( Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
}

    public static void main(String[] args) throws Exception {
        num7 test = new num7();
        test.getKey("");
        test.getKey("abcd");

    }
}
