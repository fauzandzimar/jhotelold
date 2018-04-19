public class PelangganTidakDitemukanException
{
    // instance variables - replace the example below with your own
    private int pelanggan_error;

    /**
     * Constructor for objects of class pelangganTidakDitemukanException
     */
    public pelangganTidakDitemukanException(int pelanggan_input)
    {
        // initialise instance variables
        super("Data Customer dengan ID : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method untuk menampilkan pesan exception
     *
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + " tidak ditemukan.";
    }
}
