package lambda.fonksiyonelarayuz;

public class FonksiyonKullanimi {

    public static void main(String[] args) {

        Fonksiyon fonksiyon1=(x,y)->(x+y);
        Fonksiyon fonksiyon2=(x,y)->(x*y);

        int sonuc1=fonksiyon1.hesapla(3,2);
        System.out.println("sonuc1: "+sonuc1);
        int sonuc2=fonksiyon2.hesapla(3,2);
        System.out.println("sonuc2: "+sonuc2);

    }

}
