
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int x;
    protected static int id;
    protected static String nama;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama)
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static int getID()
    {
        return 0;
    }
    
    public static String getNama()
    {
        return null;
    }
    
    public static void setID(int id)
    {
     
    }
    
    public static void setNama(String nama)
    {
        
    }
}

