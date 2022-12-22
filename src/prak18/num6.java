package prak18;
public class num6
{
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null)
            {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        num6 test = new num6();
        test.printMessage(null);
        test.printMessage("123");
    }
}
