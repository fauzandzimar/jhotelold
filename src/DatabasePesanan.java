import java.util.ArrayList;

/**
 * class DatabasePesanan .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> list_pesanan = new ArrayList<Pesanan>();
    private int LAST_PESANAN_ID;
    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        LAST_PESANAN_ID = 0;
       
    }

    public ArrayList<Pesanan> getPesananDatabase() {return list_pesanan;}
    public int getLast_Pesanan_ID(){return LAST_PESANAN_ID;}
    /**
     * Method add pesanan 
     *
     * @param pesanan
     * @return  pesanan
     */

    public  boolean addPesanan(Pesanan baru)
    {
        if(list_pesanan==null)
        {
            System.out.println("Pesanan berhasil dilakukan");
            return true;
        }
        else
        {
            System.out.println("Pesanan gagal dilakukan");
            return false;
        }
    }
    
    /**
     * Method remove pesanan 
     *
     * @param pesanan
     * @return  pesanan
     */

    public  boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * Method get pesanan
     *
     * @param pesanan
     * @return  pesanan
     */

    public Pesanan getPesanan(int id)
    {
        if(list_pesanan.contains(null))
        {
            System.out.println("Tidak ada pesanan yang sedang berjalan\n");
            return null;
        }
        if(list_pesanan.contains(id))
        {
            System.out.println(list_pesanan.get(id));

        }
    }

    public Pesanan getPesanan(Room kamar)
    {
        if(list_pesanan.contains(kamar))
        {
            return getPesanan();
        }
        else
        {
            System.out.println("Tidak ada kamar yang sedang dipesan\n");
            return null;
        }

    }

    /**
     * Method pesananDibatalkan 
     *
     * @param pesananDibatalkan
     * @return  pesananDibatalkan
     */

    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
    
}
