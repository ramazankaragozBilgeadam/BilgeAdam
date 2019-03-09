package ornekler;

import java.util.Scanner;

public class SayiTahminOyunuApp {

    //Kullanıcının 1 ile 10 arasında girdiği sayıyı
    // programın belirlediği rastgele sayı ile eşleştiren
    //sayının 2 eksiğine ve 2 fazlasına yaklaştığında
    //yaklaştınız uyarısı veren
    //yaklaşamadığında kullanıcıya yaklaşamadınız diğe uyarı veren
    //sayıyı bulduğun da kazandınız yazan
    //bir uygulama yazınız
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rastGeleUretilenSayi = (int) (Math.random() * 10);

        int tahmin = 0;
        boolean devamEdilsinMi = true;
        System.out.println("uretilens sayi:" + rastGeleUretilenSayi);

        do {

            System.out.print("Bir tahmin de bulunun:");
            tahmin = input.nextInt();

            if (tahmin == rastGeleUretilenSayi + 2 || tahmin == rastGeleUretilenSayi - 2) {
                System.out.println("Yaklaştınız..");
            } else if (tahmin == rastGeleUretilenSayi + 1 || tahmin == rastGeleUretilenSayi - 1) {
                System.out.println("Yaklaştınız...");
            } else if (tahmin == rastGeleUretilenSayi) {
                System.out.println("Kazandınız tebrikler..");
                devamEdilsinMi = false;
            } else {
                System.out.println("Yaklaşamadınız");
            }


        } while (devamEdilsinMi);


    }
}
