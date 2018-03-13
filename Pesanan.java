
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
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
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

    public double getbiaya()
    {
        return biaya;    
    }
    
    /**
     * Method get pelanggan
     *
     * @param pelanggan
     * @return  pelanggan
     */

    public Customer getpelanggan()
    {
        return pelanggan;   
    }
    
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
    /**
     * Method get StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public Customer getStatusDiproses()
    {
        return pelanggan;
    }
    
    /**
     * Method get StatusSelesai
     *
     * @param StatusSelesai
     * @return  StatusSelesai
     */

    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Method set biaya 
     *
     * @param biaya
     * @return  biaya
     */

    public double setBiaya(double biaya)
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

    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
        
    }
    
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
        
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
        
    }
    
    /**
     * Method set StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public boolean setStatusDiproses(boolean diproses)
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

    public boolean setStatusSelesai(boolean diproses)
    {
        this.isSelesai = isSelesai;
        return isSelesai;
    }
    
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /**
     * Method print biaya pelanggan
     *
     * @param biaya
     * @param pelanggan
     * @return  biaya pelanggan
     */

    public void printdata()
    {
        System.out.println("Nama:"+this.nama_pelanggan);
        System.out.println("Tipe Kamar:"+this.tipe_kamar);
        System.out.println("Diproses:"+this.isDiproses);
        System.out.println("Selesai:"+this.isSelesai);
        
    }
}
