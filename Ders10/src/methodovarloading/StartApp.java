package methodovarloading;

public class StartApp {

    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        dikdortgen.en=5;
        dikdortgen.uzunlugu=6;

        dikdortgen.alanHesapla();
        dikdortgen.alanHesapla(10,6);

        dikdortgen.cevre=2*dikdortgen.en+2*dikdortgen.uzunlugu;

        dikdortgen.alanHesapla(
                 dikdortgen.en
                ,dikdortgen.uzunlugu
                ,dikdortgen.cevre);


        double sonuc=dikdortgen
                .alanHesapla(dikdortgen.en*dikdortgen.uzunlugu);

        System.out.println("Dİkdortgenin Alanı: "+sonuc);

    }

}
