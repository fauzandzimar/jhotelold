
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private double DISCOUNT;
    private TipeKamar TIPE_KAMAR;
    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, boolean isAvailable,StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
        this.TIPE_KAMAR = TipeKamar.Premium;
        this.DISCOUNT = 0.3;
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
    
    public double getDiscount()
    {
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytarrif)
    {
        this.DISCOUNT = 0.3;
        Room.dailytariff = Room.dailytariff*DISCOUNT;
    }
    
    
}
