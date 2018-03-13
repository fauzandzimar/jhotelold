
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailytariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar,boolean isAvailable,Customer customer,double dailyTariff,
    StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.customer = customer;
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
    public int getID()
    {
        // put your code here
        return id;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNomorKamar()
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
    public boolean getStatusAvailable()
    {
        // put your code here
        return isAvailable;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer getCustomer()
    {
        // put your code here
        return customer;
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
    public void setHotel()
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
    public void setID(int id)
    {
        // put your code here
        this.id = id;
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
    public void setStatusAvailable(boolean isAvailable)
    {
        // put your code here
        this.isAvailable = isAvailable;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setCustomer(Customer customer)
    {
        // put your code here
        this.customer = customer;
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
        System.out.println("Pelanggan:"+this.customer);
        System.out.println("Harga:"+this.dailytariff);
        System.out.println("Status Kamar:"+this.status_kamar);
    }
}
