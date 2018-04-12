// Java program to check if given mobile number
// is valid.
import java.util.regex.*;
import java.util.Scanner;
 
class MobileNumberValidation { 
    public static boolean isValid(String s)
    {
        Pattern p = Pattern.compile("(62)?[0-9][0-9]{9,12}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
 
    public static void main(String[] args)
    {
        String hp;
        String kn; 
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter Kode");  
        String knno=sc.next();  
        System.out.println("Enter Nomer");  
        String hpno=sc.next(); 
        if (knno.matches("[+]{1,3}")) 
            System.out.println("Valid kode");        
        else
            System.out.println("Invalid kode");      
            
        if (hpno.matches("[+](62)?[0-9][0-9]{9,12}")) 
            System.out.println("Valid Number");        
        else
            System.out.println("Invalid Number");
    }
}
