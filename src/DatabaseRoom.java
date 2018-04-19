import java.util.ArrayList;

/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru)
    {
        if (baru.getHotel() != null)
        {
            for (Room kamar : ROOM_DATABASE)
            {
                if (kamar.getHotel().equals(baru.getHotel()))
                {
                    return false;
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else return false;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room kamar : ROOM_DATABASE)
        {
            if (kamar.getHotel().equals(hotel))
            {
                return kamar;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar : ROOM_DATABASE)
        {
            if (kamar.getHotel().equals(hotel))
            {
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar : ROOM_DATABASE)
        {
            if (kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room kamar : ROOM_DATABASE)
        {
            if (kamar.getHotel().equals(hotel))
            {
                Administrasi.pesananDibatalkan(kamar);
                ROOM_DATABASE.remove(kamar);
                return true;
            }
        }
        return false;
    }
}
