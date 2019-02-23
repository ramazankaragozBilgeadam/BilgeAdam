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

        harf=harf.toLowerCase();

        if (ifade.length()>0){

            char[] karekterler=ifade.toCharArray();
            int sayac=0;

            for (char karekter:karekterler){

                String a=String.valueOf(karekter);

                /*if (String.valueOf(karekter).equals(harf)){

                }*/

                if (a.equals(harf)){
                    sayac++;
                    //sayac=sayac+1;
                }

            }

            System.out.println("Girilen harf sayı: "+sayac);


        }else {
            System.out.println("Bir string ifade girmeniz gerekmektedir.");
        }

    }
}
