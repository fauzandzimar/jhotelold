import java.util.ArrayList;

/**
 * class DatabaseCustomer .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    /**
     * Method addCustomer untuk menambahkan Customer baru
     *
     * @param baru Parameter untuk baru
     * @return false
     */
    public static boolean addCustomer(Customer baru)
    {
        /**
        for (Customer cust : CUSTOMER_DATABASE)
        {
            if (cust.getID() == baru.getID()) return false;
        }
        if(CUSTOMER_DATABASE.get().equals(baru))
        {
            System.out.println("Data sudah terdaftar dalam Database\n");
            return false;
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
        */
        if(CUSTOMER_DATABASE.isEmpty())
        {
            CUSTOMER_DATABASE.add(baru);
            //CUSTOMER_DATABASE = pesan;
            System.out.println("Pelanggan Berhasil Ditambahkan\n");
            return true;
        }

        //if(pesan.getPelanggan() != pesan.getPelanggan())
        else
        {
            for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
            {
                //if(CUSTOMER_DATABASE.get(i).getPelanggan().equals(pesan))
                try
                {
                    if(Pesanan.getPelanggan().equals(CUSTOMER_DATABASE.get(i).getPelanggan()))
                    {
                        throw new PelangganSudahAdaException();
                    }
                }
                catch(PelangganSudahAdaException pelanggan_input)
                {
                    pelanggan_input.getPesan();
                    throw pelanggan_input;
                }
                //throw new PelangganSudahAdaException(pesan);
            }
            CUSTOMER_DATABASE.add(baru);
            //CUSTOMER_DATABASE = pesan;
            System.out.println("Pelanggan Berhasil Ditambahkan\n");
            return true;
        }
    }

    public static Customer getCustomer(int id)
    {
        for (Customer cust : CUSTOMER_DATABASE)
        {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    /**
     * Method removeCustomer untuk menghapus Customer yang sudah ada
     *
     * @param id Parameter id
     * @return false
     */
    public static boolean removeCustomer(int id)
    {
        for (Customer cust : CUSTOMER_DATABASE)
        {
            if (cust.getID() == id)
            {
                for (Pelanggan pesan : DatabasePelanggan.getPelangganDatabase())
                {
                    if (pesan.getPelanggan().equals(cust))
                    {
                        DatabasePelanggan.removePelanggan(pesan);
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        return false;
    }
}
