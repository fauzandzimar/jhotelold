import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *class Customer .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.1 22-2-2018)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected  int id;
    protected static String nama;
    protected String email;
    protected Date dob;
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

    public static String getNama()
    {
        return nama;
    }
    
    public  String getEmail()
    {
        return email;
    }
    
    public  Date getDOB()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        System.out.printf("DOB : " + sdf.format(dob) + "\n\n");
        return dob;
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
    
    public boolean setEmail(String email)
    {
        // ^ : Matches the beginning of the line
        // (re) : Grouping
        // . : Any character (may or may not match line terminators)
        // re+ : Matches 1 or more of the previous thing
        // @ : untuk @ dalam format email
        // $ : Matches the end of the line
        // ^(.+)@(.+)$ berarti abcde,123@abcde.com
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher((CharSequence) email);
        if(matcher.matches() == true)
        {
            this.email = email;
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
        
        else if(matcher.matches() == false)
        {
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println("Maaf format email yang anda masukan salah" + " : "+ matcher.matches() + "\n");
        }
        return matcher.matches(); 
    }
    
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }      
    
    public String toString()
    {
        System.out.println("Nama Pelanggan:" + " " + getNama());
        System.out.println("Customer ID:"+getID());
        System.out.println("Nama:"+getNama());
        System.out.println("Email:"+getEmail());
        System.out.println("Tanggal:"+getDOB());
        return "";
    }
}

