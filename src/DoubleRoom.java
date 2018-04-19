
/**
 * Write a description of class DoubleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private int x;
    private Customer customer2;
    private TipeKamar TIPE_KAMAR;
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable,StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
    }

    public Customer getCustomer2()
    {
        return customer2;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
}
