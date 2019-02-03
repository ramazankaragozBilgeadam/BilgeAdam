package kosulluifadeler;

import java.util.Scanner;

public class ElseIfYapisiApp {

    public static void main(String[] args) {


        int sayi1,sayi2;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2=input.nextInt();

        if (sayi1>sayi2){
            System.out.println("SAYI1 büyüktür sayı2'den.");
        }else if (sayi1==sayi2){
            System.out.println("Sayı1 ve Sayı2 eşittir.");
        }else if (sayi1<10){
            System.out.println("Say1 10'dan küçüktür.");
            if (sayi1==5){
                System.out.println("sayi1 5'e eşittir.");
            }
        }else {
            System.out.println("sayı1 küçüktür sayı2'den.");
        }

        System.out.println("Güle güle..");
    }
}
