public class RoomSudahAdaException extends Exception
{
    private Room room_error;

    /**
     * Constructor for objects of class roomSudahAdaException
     */
    public RoomSudahAdaException(Room room_input)
    {
        super("Kamar dengan nomor ruang ");
        //room_input = room_error;
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
        return super.getMessage() + room_error.getRoomNumber() + " pada “ + room_error.getroom() + “sudah terdaftar." ;
    }

}
