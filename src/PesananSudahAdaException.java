public class PesananSudahAdaException extends Exception
{
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pelanggan dengan nama ");
        //pesanan_input = pesanan_error;
        pesanan_error = pesanan_input;
    }

    /**
     * Method untuk menampilkan pesan exception
     *
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getPesan()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan. "
    }

}
