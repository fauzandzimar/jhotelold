
/**
 * class Lokasi .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private int x;
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord,float y_coord,String deskripsiLokasi)
    {
        // initialise instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi; 
    }

    /**
     * Method get x
     *
     * @param x
     * @return  x
     */

    public float getX()
    {
        return x_coord;
    }
    
    /**
     * Method get y
     *
     * @param y
     * @return  y
     */

    public float getY()
    {
        return y_coord;
    }
    
    /**
     * Method get deskripsiLokasi
     *
     * @param deskripsiLokasi
     * @return deskripsiLokasi
     */

    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
     * Method set x
     *
     * @param x
     * @return  x
     */

    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    
    /**
     * Method set y
     *
     * @param y
     * @return  y
     */

    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    /**
     * Method set deskripsiLokasi
     *
     * @param deskripsiLokasi
     * @return deskripsiLokasi 
     */

    public void setDeskripsi(String deskripsi)
    {
       this.deskripsiLokasi = deskripsiLokasi; 
    }
    
    /**
     * Method print x y deskripsilokasi
     *
     * @param x
     * @param y
     * @param deskripsilokasi
     * @return  x y deskripsilokasi
     */

    public void printdata()
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi; 
    }
}
