public class PelangganSudahAdaException 
{
    // instance variables - replace the example below with your own
    private Customer pelanggan_error;

    /**
     * Constructor for objects of class pelangganSudahAdaException
     */
    public pelangganSudahAdaException(Customer pelanggan_input)
    {
        // initialise instance variables
        super("Pelanggan dengan data :");
        //pelanggan_input = pelanggan_error;
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
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }

}
