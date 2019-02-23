package odev;

import java.util.Scanner;

public class DiziMerdivenApp {


    public static void main(String[] args) {

        //kare bir dizi 4x4 (Satır ve sutun sayısı eşit)
        //Kullanıcı dizinin boyutunu girecek ve merdiven
        //şeklin de aşağıdaki şekli oluşturacak

        // dizi[i][k]='x'

        /*
        4x4 dizi;
             x
            xx
           xxx
          xxxx

         5x5 dizi;
             x
            xx
           xxx
          xxxx
         xxxxx


         */


        /*int[][] dizi2d=new int[4][5];
        *//*dizi2d[0]=new int[5];
        dizi2d[1]=new int[5];
        dizi2d[2]=new int[5];
        dizi2d[3]=new int[5];*//*
        System.out.println(dizi2d.length);
        System.out.println("sutun boyutu "+dizi2d[0].length);*/

        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int diziBoyutu=scanner.nextInt();

        char[][] dizi=new char[diziBoyutu][diziBoyutu];

        for (int i=0;i<dizi.length;i++){

            for (int k=0;k<dizi[0].length;k++){

                if (i+k+2>dizi.length){
                    dizi[i][k]='x';
                }else {
                    dizi[i][k]=' ';
                }

            }

        }

        String deger="";

        for (int i=0;i<dizi.length;i++){

            for (int k=0;k<dizi[0].length;k++){
                deger=deger+dizi[i][k]+" ";
            }

            System.out.println(deger);
            deger="";
        }




    }
}
