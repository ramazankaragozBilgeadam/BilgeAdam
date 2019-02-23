package nesne;

public class StartApp4 {


    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        dikdortgen.uzunlugu=5;
        dikdortgen.en=6;

        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();

        Dikdortgen yeniDikdortgen=new Dikdortgen();
        yeniDikdortgen.uzunlugu=20;
        yeniDikdortgen.en=50;

        yeniDikdortgen.alanHesapla();
        yeniDikdortgen.cevreHesapla();
    }
}
