package tipdonusumleri;

public class Main {

    /**
     * @Author Ramazan Karagöz
     * @throws NullPointerException
     * @param args
     */
    public static void main(String[] args) {
        //tekli

        /*
        çoklu comment
         */

        /*
        Tip dönüşümleri genelde küçükten büyüğe doğru olur.
        Dikkat etmemiz gereken büyükten küçüğe doğru olan tip
        dönüşümleridir.Aksi taktir de veri kaybı yaşayabiliriz.
         */

        byte bytea = 127;
        int intb;

        intb = bytea;

        intb = 127;
        bytea = (byte) intb;
        System.out.println("Maximum boyutu geçmediğim tip dönüşümü "+bytea);

        intb = 256;
        bytea = (byte) intb;
        System.out.println("Maximum boyutu geçtiğin de tip dönüşümü "+bytea);

        Integer xInt=12;
        String xString;
        xString=xInt.toString();
        System.out.println(xString);


    }
}
