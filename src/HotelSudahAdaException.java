public class HotelSudahAdaException extends Exception
{
    private Hotel hotel_error;

    /**
     * Constructor for objects of class hotelSudahAdaException
     */
    public HotelSudahAdaException(Hotel hotel_input)
    {
        super("Hotel dengan nama ");
        //hotel_input = hotel_error;
        hotel_error = hotel_input;
    }

    /**
     * Method untuk menampilkan pesan exception
     *
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getPesan()
    {
        return super.getMessage() + hotel_error.getNama() + "Sudah terdaftar";
    }

}
