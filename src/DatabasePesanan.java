import java.util.ArrayList;

/**
 * class DatabasePesanan .
 *
 * @author (Fauzan Dzimar Rizqi)
 * @version (0.2 1-3-2018)
 */
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananId()
    {
        return LAST_PESANAN_ID;
    }

    /**
     * Method addPesanan untuk menambahkan pesanan
     *
     * @param baru Parameter baru
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        /**if (baru.getStatusAktif() == true)
        {
            return false;
            try
            {
                if(pesan.getPelanggan().equals(PESANAN_DATABASE.get(i).getPelanggan()))
                {
                    //System.out.println("Pesanan Gagal Dilakukan\n");
                    //return false;
                    throw new PesananSudahAdaException(pesan);
                }
            }
            catch(PesananSudahAdaException pesanan_input)
            {
                pesanan_input.getMessage();
                throw pesanan_input;
            }
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            return true;
        }*/
        if(PESANAN_DATABASE.isEmpty())
        {
            PESANAN_DATABASE.add(baru);
            //PESANAN_DATABASE = pesan;
            System.out.println("Pesanan Berhasil Dilakukan\n");
            return true;
        }

        //if(pesan.getPelanggan() != pesan.getPelanggan())
        else
        {
            for (int i = 0; i < PESANAN_DATABASE.size(); i++)
            {
                //if(PESANAN_DATABASE.get(i).getPelanggan().equals(pesan))
                try
                {
                    if(Pesanan.getPelanggan().equals(PESANAN_DATABASE.get(i).getPelanggan()))
                    {
                        //System.out.println("Pesanan Gagal Dilakukan\n");                        
                        //return false;
                        throw new PesananSudahAdaException(baru);
                    }
                }
                catch(PesananSudahAdaException pesanan_input)
                {
                    pesanan_input.getPesan();
                    throw pesanan_input;
                }
                //throw new PesananSudahAdaException(pesan);
            }
            PESANAN_DATABASE.add(baru);
            //PESANAN_DATABASE = pesan;
            System.out.println("Pesanan Berhasil Dilakukan\n");
            return true;
        }

    }


    public static Pesanan getPesanan(int id)
    {
        for (Pesanan pesan: PESANAN_DATABASE)
        {
            if(pesan.getID() == id)
            {
                return pesan;
            }
            else
            {
                return null;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for (Pesanan pesan: PESANAN_DATABASE)
        {
            if(pesan.getRoom().equals(kamar))
            {
                return pesan;
            }
            else
            {
                return null;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (Pesanan pesan: PESANAN_DATABASE)
        {
            if(pesan.getStatusAktif() == true)
            {
                return pesan;
            }
            else
            {
                return null;
            }
        }
        return null;
    }

    /**
     * Method removePesanan untuk menghapus pesanan
     *
     * @param pesan Parameter pesan
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for (Pesanan y: PESANAN_DATABASE)
        {
            if(pesan.equals(y))
            {
                if(pesan.getRoom() != null) Administrasi.pesananDibatalkan(pesan);
                else if (pesan.getStatusAktif()) pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(y);
                return true;
            }

        }
        return false;
        try
        {
            throw new PesananTidakDitemukanException(pesan);
        }
        catch(PesananTidakDitemukanException pesanan_input)
        {
            pesanan_input.getMessage();
            throw pesanan_input;
        }
    }
}