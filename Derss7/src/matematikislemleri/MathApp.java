package matematikislemleri;

import java.util.Random;

public class MathApp {

    public static void main(String[] args) {

        //Math sınıfı java.lang paketi ile otomatik olarak beraber gelir.

        System.out.println("Sayının kökünü alma: "+Math.sqrt(16));
        System.out.println("Sayının mutlak değeri: "+Math.abs(-2+1));
        System.out.println("Ondalıklı sayının bir üst tam sayı değerini alma: "+Math.ceil(2.17));
        System.out.println("Ondalıklı sayının bir alt tam sayı değerini alma: "+Math.floor(5.98));
        System.out.println("Ondalıklı sayıda en yakın sayı değeri (0.50'den sonra yukarsı,öncesi aşağısı)"+Math.round(2.50));
        System.out.println("Bir sayının üssünü alma: "+Math.pow(5,5));
        System.out.println("Sayılar arasında büyük olanı bulma(1-6): "+Math.max(1,6));
        System.out.println("Sayılar arasında küçük olanı bulma(1-6): "+Math.min(1,6));
        System.out.println("PI sayısının değeri: "+Math.PI);
        System.out.println("Euler değeri: "+Math.E);

        System.out.println("Sıfır ile 1 arasında ondalıklı random sayı üretme: "+Math.random());
        System.out.println("0 ile 20 arasında sayı üretme: "+(int)(Math.random()*20));

        Random random=new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5));

    }

}
