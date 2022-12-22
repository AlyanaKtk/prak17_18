package prak18;

public class num5
{
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "data for " + key;
    }
    public static void main(String[] args)
    {

        printMessage(null);
    }
}
