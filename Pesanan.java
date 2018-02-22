
/**
 * Write a description of class Pesanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private int x;
    private static double biaya;
    private static String nama_pelanggan;
    private static String jenis_kamar;
    private static boolean isDiproses;
    private static boolean isSelesai;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan()
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
    
    public static double getbiaya()
    {
     return 0;    
    }
    
    public static Customer getpelanggan()
    {
        return null;   
    }
    
    public static boolean getStatusDiproses()
    {
        return false;
    }
    
    public static boolean getStatusSelesai()
    {
        return false;
    }
    
    public static double setBiaya(double biaya)
    {
        return 0;
    }
    
    public static Customer setPelanggan(Customer baru)
    {
        return null;
    }
    
    public static boolean setStatusDiproses(boolean diproses)
    {
        return false;
    }
    
    public static boolean setStatusSelesai(boolean diproses)
    {
        return false;
    }
    
    
}
