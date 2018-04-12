
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private static String nomor_kamar;
    private boolean isAvailable;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    protected static double dailytariff;
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar,
    StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.dailytariff = dailytariff;
        this.status_kamar = status_kamar;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Hotel getHotel()
    {
        // put your code here
        return hotel;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String getNomorKamar()
    {
        // put your code here
        return nomor_kamar;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getDailyTariff()
    {
        // put your code here
        return dailytariff;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public StatusKamar getStatusKamar()
    {
        // put your code here
        return status_kamar;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Pesanan getPesanan()
    {
        // put your code here
        return pesan;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    abstract public TipeKamar getTipeKamar();
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setHotel(Hotel hotel)
    {
        // put your code here
        this.hotel = hotel;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setNomorKamar(String nomor_kamar)
    {
        // put your code here
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDailyTariff(double dailytariff)
    {
        // put your code here
        this.dailytariff = dailytariff;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        // put your code here
        this.status_kamar = status_kamar;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setPesanan(Pesanan pesan)
    {
        // put your code here
        this.pesan = pesan;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printData()
    {
        // put your code here
        System.out.println("Hotel:"+this.hotel);
        System.out.println("Nomor Kamar:"+this.nomor_kamar);
        System.out.println("Tersedia:"+this.isAvailable);
        System.out.println("Tipe Kamar:"+ getTipeKamar());
        System.out.println("Harga:"+this.dailytariff);
        System.out.println("Status Kamar:"+this.status_kamar);
    }
    
    public String toString()
    {
        
        System.out.println("Hotel:"+getHotel());
        System.out.println("Nomor Kamar:"+getNomorKamar());
        System.out.println("Tersedia:"+getStatusAvailable());
        System.out.println("Tipe Kamar:"+ getTipeKamar());
        System.out.println("Harga:"+getDailyTariff());
        System.out.println("Status Kamar:"+getStatusKamar());
        return "";
    }
}
