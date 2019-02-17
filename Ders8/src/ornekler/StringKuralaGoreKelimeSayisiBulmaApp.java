package ornekler;

import java.util.Scanner;

public class StringKuralaGoreKelimeSayisiBulmaApp {


    public static void main(String[] args) {

        //Camel Case girilen string bir cümledeki kelime sayısı bulma
        //Camel Case string kullanıcı tarafından girilecek.
        //String deger="stringIfadeleriGetirenMethod";

        Scanner scanner=new Scanner(System.in);

        System.out.print("Kelime sayısını bulmak istediğiniz Camel Case bir cümle giriniz:");
        String deger=scanner.next();

        int sayac=1;

        char[] dizi=deger.toCharArray();

        String temp="";

        for (int i=0;i<dizi.length;i++){

            temp=String.valueOf(dizi[i]);

            if (temp.equals(temp.toUpperCase())){
                sayac++;
            }
        }

        System.out.println("Girilen kelime sayısı: "+sayac);


    }
}
