package kosulluifadeler;

import java.util.Scanner;

public class IfElseYapisiApp {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int sayi2=input.nextInt();

        if (sayi1==sayi2){
            System.out.println("Sayı1 ve Sayı2 eşittir.");
        }else{
            System.out.println("Sayı1 ve Sayı2 eşit değildir.");
        }

        System.out.println("Güle güle...");



    }
}
