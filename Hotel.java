
/**
 * class Hotel .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private int x;
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama,Lokasi lokasi,int bintang)
    {
        // initialise instance variables
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    /**
     * Method get bintang
     *
     * @param bintang
     * @return bintang   
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * Method get nama
     *
     * @param nama
     * @return nama   
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method get lokasi
     *
     * @param lokasi
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * Method set nama
     *
     * @param nama
     * @return nama   
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method set lokasi
     *
     * @param lokasi
     * @return lokasi   
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Method set bintang
     *
     * @param bintang
     * @return bintang   
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    /**
     * Method print nama lokasi bintang
     *
     * @param nama
     * @param lokasi
     * @param bintang
     * @return nama lokasi bintang   
     */
    public void printData()
    {
        System.out.println("Nama Hotel:"+this.nama);
        System.out.println("Lokasi:"+this.lokasi);
        System.out.println("Bintang:"+this.bintang);
    }
}
