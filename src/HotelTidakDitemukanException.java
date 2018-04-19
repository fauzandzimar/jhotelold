public class HotelTidakDitemukanException extends Exception
{
        private int hotel_error;

        /**
         * Constructor for objects of class HotelTidakDitemukanException
         */
    public HotelTidakDitemukanException(int hotel_input)
        {
            // initialise instance variables
            super("Hotel dengan ID : ");
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
            return super.getMessage() + hotel_error + " tidak ditemukan";
        }

}
