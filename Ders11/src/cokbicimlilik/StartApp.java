package cokbicimlilik;

//Bir nesnenin başka bir nesne gibi davranış sergilemesi
public class StartApp {

    public static void main(String[] args) {

        Sekiller sekiller=new Sekiller();

        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);

        Kare kare=new Kare();
        kare.setKenar(3);

        sekillerinAlaniniHesapla(sekiller);
        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);

        Daire daire=new Daire();
        sekillerinAlaniniHesapla(daire);

        sekillerinCevresiniHesapla(sekiller);
        sekillerinCevresiniHesapla(dikdortgen);
        sekillerinCevresiniHesapla(kare);
        sekillerinCevresiniHesapla(daire);

    }

    public static void sekillerinAlaniniHesapla(Sekiller sekiller){
        System.out.println("Şeklin alani: "+sekiller.alanHesapla());
    }

    public static void sekillerinCevresiniHesapla(Sekiller sekiller){
        System.out.println("Şeklin çevresi: "+sekiller.cevreHesapla());
    }
}
