package prak18;
import java.util.Scanner;
public class num3
{
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getCanonicalName());
        }
    }
}
