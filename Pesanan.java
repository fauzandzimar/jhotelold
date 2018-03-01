
/**
 * class Pesanan .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private int x;
    private  double biaya;
    private  Customer pelanggan;
    private  String nama_pelanggan;
    private  String jenis_kamar;
    private  boolean isDiproses;
    private  boolean isSelesai;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya,Customer pelanggan)
    {
        // initialise instance variables
       this.biaya=biaya;
       this.pelanggan = pelanggan;
    }
    
    /**
     * Method get biaya
     *
     * @param biaya
     * @return  biaya
     */

    public  double getbiaya()
    {
        return biaya;    
    }
    
    /**
     * Method get pelanggan
     *
     * @param pelanggan
     * @return  pelanggan
     */

    public  Customer getpelanggan()
    {
        return pelanggan;   
    }
    
    /**
     * Method get StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public  boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Method get StatusSelesai
     *
     * @param StatusSelesai
     * @return  StatusSelesai
     */

    public  boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * Method set biaya 
     *
     * @param biaya
     * @return  biaya
     */

    public  double setBiaya(double biaya)
    {
        this.biaya = biaya;
        return biaya;
    }
    
    /**
     * Method set pelanggan
     *
     * @param pelanggan
     * @return  pelanggan
     */

    public  Customer setPelanggan(Customer baru)
    {
        this.pelanggan = pelanggan;
        return pelanggan;
    }
    
    /**
     * Method set StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public  boolean setStatusDiproses(boolean diproses)
    {
        this.isDiproses = isDiproses;
        return isDiproses;
    }
    
    /**
     * Method set StatusSelesai
     *
     * @param StatusSelesai
     * @return  StatusSelesai
     */

    public  boolean setStatusSelesai(boolean diproses)
    {
        this.isSelesai = isSelesai;
        return isSelesai;
    }
    
    /**
     * Method print biaya pelanggan
     *
     * @param biaya
     * @param pelanggan
     * @return  biaya pelanggan
     */

    public void printdata(double biaya,Customer pelanggan)
    {
        this.biaya=biaya;
        this.pelanggan = pelanggan;
    }
}
