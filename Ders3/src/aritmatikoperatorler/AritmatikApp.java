package aritmatikoperatorler;

public class AritmatikApp {

    public static void main(String[] args){

        //Değişken İsimleri Farklı Olmalıdır.
        int a=7,c=3,d;
        int b=3;
        int sonuc;
        double bolmeSonucu,x=7;


        sonuc=a+b;
        System.out.println("Toplama işlemi: "+sonuc);
        sonuc=a-b;
        System.out.println("Çıkarma işlemi: "+sonuc);
        sonuc=a*b;
        System.out.println("Çarpma işlemi: "+sonuc);
        sonuc=a/b;
        System.out.println("Integer Bölme İşlemi: "+sonuc);
        bolmeSonucu=x/b;
        System.out.println("Double Bölme İşlemi: "+bolmeSonucu);
        sonuc=a%b;
        System.out.println("(Mod Alma)Sayının Kalanını bulma işlemi: "+sonuc);


        a=a+b;
        System.out.println("Normal atama: "+a);
        a=7;
        a+=b;
        System.out.println("Aritmatik atama toplama işemi : "+a);
        a=7;
        a=a-b;
        System.out.println("Normal atama: "+a);
        a=7;
        a-=b;
        System.out.println("Aritmatik atama çıkarma işlemi : "+a);

        a=7;
        a*=b;
        System.out.println("Aritmatik atama çarpma işlemi : "+a);
        a=7;
        a%=b;
        System.out.println("Aritmatik atama mod alma işlemi : "+a);
        a=7;
        a/=b;
        System.out.println("Aritmatik atama bölme işlemi: "+a);


    }
}
