
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    Single("Single Room"), Double("Double Room"), Premium("Premium Room");
    
    private String tipe_kamar;
    
    TipeKamar(String tipe_kamar)
    {
        this.tipe_kamar= tipe_kamar;
    }
    public String toString()
    {
        return tipe_kamar;
    }
}
