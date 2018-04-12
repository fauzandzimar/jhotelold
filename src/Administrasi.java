
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }

    /**
     * Method ini untuk memproses ruangan yang akan di-assign
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan,kamar);
    }
    
    /**
     * Method ini untuk menyatakan bahwa status ruangan sudah berubah menjadi �booked� dan �ter-link� dengan objek Pesanan yang diberikan.
     *
     * @param  Pesanan
     * @param  Room
     * @return    the sum of x and y
     */
    public void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan); 
    }
    
    /**
     * Method ini untuk menyatakan kalau status room menjadi �vacant� dan �ter-unlink� dengan objek Pesanan apapun.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null); 
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananSelesai(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        pesan.setRoom(null);
        roomLepasPesanan(kamar); 
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananDibatalkan(Pesanan pesan)
    {
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        roomLepasPesanan(pesan.getRoom());
        pesan.setRoom(null);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
     *
     * @param  'y'  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananSelesai(Pesanan pesan)
    {
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        roomLepasPesanan(pesan.getRoom());
        pesan.setRoom(null);
    }
    
    
}
