package methodlar;

import java.util.Scanner;

public class DortIslem {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek, sayi1, sayi2;
        double sonuc;
        boolean devamEdilsinmi = false;

        do {

            System.out.println("Hoşgeldiniz...");
            System.out.println("Hangi İşlemi Yapmak İstiyorsunuz ?");
            System.out.println("1-)Toplama İşlemi");
            System.out.println("2-)Çıkarma İşlemi");
            System.out.println("3-)Bölme İşlemi");
            System.out.println("4-)Çarpma İşlemi");
            System.out.println("0-)Çıkış");

            System.out.print("Seçiniz:");
            secenek = input.nextInt();

            switch (secenek) {
                case 1:
                    System.out.print("1.sayıyı giriniz:");
                    sayi1 = input.nextInt();
                    System.out.print("2.sayıyı giriniz:");
                    sayi2 = input.nextInt();
                    sonuc = toplamaIslemi(sayi1, sayi2);
                    System.out.println("Toplama İşleminizin sonucu: " + sonuc);
                    devamEdilsinmi = true;
                    break;
                case 2:
                    System.out.print("1.sayıyı giriniz:");
                    sayi1 = input.nextInt();
                    System.out.print("2.sayıyı giriniz:");
                    sayi2 = input.nextInt();
                    sonuc=cikarmaIslemi(sayi1,sayi2);
                    System.out.println("Çıkarma İşleminizin Sonucu: "+sonuc);
                    devamEdilsinmi=true;
                    break;
                case 3:
                    System.out.print("1.sayıyı giriniz:");
                    sayi1 = input.nextInt();
                    System.out.print("2.sayıyı giriniz:");
                    sayi2 = input.nextInt();
                    sonuc=bolmeIslemi(sayi1,sayi2);
                    System.out.println("Bölme İşleminizin Sonucu: "+sonuc);
                    devamEdilsinmi=true;
                    break;
                case 4:
                    System.out.print("1.sayıyı giriniz:");
                    sayi1 = input.nextInt();
                    System.out.print("2.sayıyı giriniz:");
                    sayi2 = input.nextInt();
                    sonuc=carpmaIslemi(sayi1,sayi2);
                    System.out.println("Çarpma İşleminizin Sonucu: "+sonuc);
                    devamEdilsinmi=true;
                    break;
                case 0:
                    devamEdilsinmi = false;
                    System.out.println("Güle güle...");
                    break;
                default:
                    System.err.println("Yanlış bir giriş yaptınız!");
                    devamEdilsinmi = true;
            }

        } while (devamEdilsinmi);

    }

    public static double toplamaIslemi(double sayi1, double sayi2) {

        /*double sonuc;
        sonuc = sayi1 + sayi2;


        return sonuc;*/

        return sayi1+sayi2;
    }

    public static double cikarmaIslemi(double sayi1,double sayi2){

        return sayi1-sayi2;
    }

    public static double bolmeIslemi(double sayi1,double sayi2){
        return sayi1/sayi2;
    }

    public static double carpmaIslemi(double sayi1,double sayi2){
        return sayi1*sayi2;
    }


}
