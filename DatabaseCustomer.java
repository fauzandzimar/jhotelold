
/**
 * class DatabaseCustomer .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private int x;
    private static String[] list_customer; 
    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Method add customer 
     *
     * @param customer
     * @return  add customer
     */

    public static boolean addCustomer(Customer baru)
    {
        return false;
    }
    
    /**
     * Method remove customer 
     *
     * @param id
     * @return  customer id removed
     */

    public static int removeCustomer(int id)
    {
        return id;
    }
    
    /**
     * Method get CustomerDatabase
     *
     * @param CustomerDatabase
     * @return CustomerDatabase 
     */

    public static String[] getCustomerDatabase()
    {
        return list_customer;
    }
    
}
