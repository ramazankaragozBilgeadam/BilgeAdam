package istisnalar;

/**
 * Uygulama çalışma esnasında beklenmedik hatalar alınabilir,
 * bunları try-catch blokları ile kontrol edebiliriz.
 *
 * try-catch, throw, throws, finally, exception sınıfları
 */
public class StartApp {

    public static void main(String[] args) {

        int[] dizi=new int[3];

        dizi[0]=3;
        dizi[1]=5;
        dizi[2]=7;

        try{

            System.out.println(dizi[2]);
            System.out.println(dizi[3]);

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Aradığını yanlış yerde arıyosun.");
        }

        System.out.println("kod burada çalışıyor mu?");


    }

}
