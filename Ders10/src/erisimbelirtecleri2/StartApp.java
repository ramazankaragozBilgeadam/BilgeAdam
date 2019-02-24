package erisimbelirtecleri2;

import erisimbelirtecleri.Dikdortgen;


//private ile sadece sınıf üzerinden erişebilirim.
//public ile tüm paketlerden erişim sağlayabilirim.
//protected ile sadece aynı paketten
// ve protected tanımlı methodu olan sınıfın alt sınıflarından
//erişebilirim
//default erişim belirletici ile sadece
// o paket içerisinden erişebilirim
public class StartApp {

    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        dikdortgen.setEn(10);

    }

}
