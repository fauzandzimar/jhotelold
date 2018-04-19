public class PesananTidakDitemukanException extends Exception
{
    private Customer pelanggan_error;

    /**
     * Constructor for objects of class PesananTidakDitemukanException
     */
    public PesananTidakDitemukanException(Customer pelanggan_input)
    {
        // initialise instance variables
        super("Pesanan yang dipesan oleh ");
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
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }

}