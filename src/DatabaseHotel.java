import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    public static boolean addHotel(Hotel baru)
    {
        for (Hotel hotel : HOTEL_DATABASE)
        {
            if (hotel.getID() == baru.getID()) return false;
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    public static Hotel getHotel(int id)
    {
        for (Hotel hotel : HOTEL_DATABASE)
        {
            if (hotel.getID() == id) return hotel;
        }
        return null;
    }

    public static boolean removeHotel(int id)
    {
        for (Hotel hotel : HOTEL_DATABASE)
        {
            if (hotel.getID() == id)
            {
                for (Room kamar : DatabaseRoom.getRoomsFromHotel(hotel))
                {
                    DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        return false;
    }
}
