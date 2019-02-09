package odev;


import java.util.Scanner;

/**
 * Klavyeden girilen sayının
 * asal olup olmadığını bulan program.
 */
public class AsalSayiApp {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi=input.nextInt();

        if (sayi>1){
            boolean asalMiDegilMi=false; //flag

            for (int i=2;i<sayi;i++){

                if (sayi%i==0){
                    asalMiDegilMi=true;
                }
            }
            if (asalMiDegilMi){
                System.out.println("Sayı asal değildir.");
            }else {
                System.out.println("Sayı asaldır.");
            }
        }


    }


}
