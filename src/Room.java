
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailytariff;
    private StatusKamar status_kamar;

    public Room(Hotel hotel, String nomor_kamar,
                StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar.VACANT;
    }

    public Hotel getHotel()
    {
        return hotel;
    }

    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    public double getDailyTariff()
    {
        return dailytariff;
    }

    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    public abstract TipeKamar getTipeKamar();

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    public void setDailyTariff(double dailytariff)
    {
        this.dailytariff = dailytariff;
    }

    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }


    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) == null)
        {
            return "\nNama Hotel     :" + getHotel().getNama()
                    + "\nTipe Kamar     :" + getTipeKamar()
                    + "\nHarga          :" + getDailyTariff()
                    + "\nStatus Kamar   :" + getStatusKamar().toString();
        }
        else
        {
            return "\nNama Hotel     :" + getHotel().getNama()
                    + "\nTipe Kamar     :" + getTipeKamar()
                    + "\nHarga          :" + getDailyTariff()
                    + "\nStatus Kamar   :" + getStatusKamar().toString()
                    + "Pelanggan        :" + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }
}
