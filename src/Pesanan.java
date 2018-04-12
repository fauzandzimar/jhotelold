import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 * class Pesanan .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari,Customer pelanggan)
    {
        // initialise instance variables
       this.biaya=biaya;
       this.pelanggan = pelanggan;

    }

    public int getID(){return id;}
    /**
     * Method get biaya
     *
     * @param biaya
     * @return  biaya
     */

    public double getBiaya()
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

    public double getStatusAktif()
    {
        return isAktif;
    }

    /**
     * Method get StatusDiproses
     *
     * @param StatusDiproses
     * @return  StatusDiproses
     */

    public boolean getStatusDiproses()
    {
        return isDiproses;
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
    
    public Date getTanggalPesan()
    {
        /**
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        System.out.printf("Tanggal Pemesanan : " + sdf.format(tanggalPesan) + "\n\n");
        return tanggalPesan;
         */
        GregorianCalendar calendar = new GregorianCalendar();
        Date tanggalPesan = calendar.getTime();
        System.out.println(tanggalPesan);
    }

    public void setID(int id) {this.id = id;}
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

    public void setStatusAktif(boolean aktif)
    {
        this.isAktif = true;

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
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    /**
     * Method tostring
     *
     * @param biaya
     * @param pelanggan
     * @return  biaya pelanggan
     */
    public String toString()
    {
        String final_status = "KOSONG";
        if (isDiproses == true & isSelesai == false)
        {
            final_status = "DIPROSES";
        }
        
        if (isDiproses == false & isSelesai == false)
        {
            final_status = "KOSONG";
        }
        
        if (isDiproses == false & isSelesai == true)
        {
            final_status = "SELESAI";
        }
        
        if (pelanggan == null)
        {    
                System.out.println("Dibuat oleh " + Customer.getNama() + ". Proses booking untuk " +Hotel.getNama() + 
                "kamar nomor " + Room.getNomorKamar() + " dengan tipe kamar yang diinginkan " + ". Status: " + final_status + "." );
            }
        
        return"";
    }
}

