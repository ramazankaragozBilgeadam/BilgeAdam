package odev;

import java.util.Scanner;

public class GirilenIfadeDeBelirliHarfSayisiniBulanApp {

    public static void main(String[] args) {

        //Kullanıcı ilk olarak bir string ifade girecek
        //Sonrasın da bir harf girecek
        //Program girilen harf sayısını o ifade içerisinde bulacak.


        Scanner input=new Scanner(System.in);

        System.out.print("Bir string ifade giriniz: ");
        String ifade=input.nextLine(); //Ard arda bir string ifade girilirken
        // nextline ilk kullanılmalı
        ifade=ifade.toLowerCase();
        System.out.print("Sayısı bulunacak harfi giriniz: ");
        String harf=input.next();

        /*


       *
         */
        System.out.println("Girilen harf sayısından şu kadar var: ");

    }
}
