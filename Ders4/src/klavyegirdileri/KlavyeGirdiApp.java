package klavyegirdileri;

import java.util.Scanner;

public class KlavyeGirdiApp {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //scanner.nextInt(); Integer değer okuyacağım zaman bu methodu kullanıyoruz.
        //scanner.nextDouble(); Double değer okunacağı zaman
        //scanner.next(); //String değerleri okumak için
        //scanner.nextLine(); //String değerleri okumak için

        int sayi1,sayi2,sonuc;

        System.out.println("İki sayıyı toplayan program..");
        System.out.print("Birinci sayıyı giriniz:");
        sayi1=scanner.nextInt();
        //System.out.println("Girdiğiniz sayı: "+sayi1);
        System.out.print("İkinci sayıyı giriniz:");
        sayi2=scanner.nextInt();

        sonuc=sayi1+sayi2;
        System.out.println("Toplama işleminizin sonucu: "+sonuc);

    }

}
