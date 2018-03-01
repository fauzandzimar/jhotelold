
/**
 *class Customer .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.1 22-2-2018)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int x;
    protected  int id;
    protected  String nama;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama)
    {
        // initialise instance variables
        this.nama = nama;
        this.id = id;
    }

    /**
     * Method get id 
     *
     * @param id
     * @return id 
     */

    public  int getID()
    {
        return id;
    }
    
    /**
     * Method get nama
     *
     * @param nama
     * @return nama  
     */

    public  String getNama()
    {
        return nama;
    }
    
    /**
     * Method set id 
     *
     * @param id
     * @return id 
     */

    public void setID(int id)
    {
     this.id = id;
    }
    
    /**
     * Method set nama
     *
     * @param nama
     * @return nama 
     */

    public  void setNama(String nama)
    {
     this.nama = nama;
    }
    
    /**
     * Method print nama id
     *
     * @param nama
     * @param id
     * @return nama id
     */

    public void printdata(String nama,int id)
    {
        this.nama = nama;
        this.id = id;
    }
}

