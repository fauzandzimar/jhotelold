
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
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari,double biaya,Customer pelanggan)
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
    
    public double getJumlahHari()
    {
        return jumlahHari;    
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

    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
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
    
    /**
     * Method set StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = isDiproses;
        
    }
    
    /**
     * Method set StatusSelesai
     *
     * @param StatusSelesai
     * @return  StatusSelesai
     */

    public void setStatusSelesai(boolean diproses)
    {
        this.isSelesai = isSelesai;
        
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
        System.out.println("Nama Pelanggan:"+this.pelanggan);
        System.out.println("Diproses:"+this.isDiproses);
        System.out.println("Selesai:"+this.isSelesai);
        System.out.println("Biaya:"+this.biaya);
    }
}
