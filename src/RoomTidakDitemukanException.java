public class RoomTidakDitemukanException extends Exception
{
    private Hotel hotel_error;
    private String room_error;

    /**
     * Constructor for objects of class roomTidakDitemukanException
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input)
    {
        // initialise instance variables
        super("Kamar yang terletak di : ");
        hotel_error = hotel_input;
        room_error = room_input;
    }

    /**
     * Method untuk menampilkan pesan exception
     *
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getPesan()
    {
        return super.getMessage() + hotel_error + "dan dengan nomor kamar " + room_error + "tidakditemukan";
    }

}
