package cokbicimlilik;

public class StartApp2 {

    public static void main(String[] args) {


        Sekiller sekiller=new Sekiller();

        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setBoy(6);
        dikdortgen.setEn(5);
        Kare kare=new Kare();
        kare.setKenar(10);

        //sekillerinAlaniniHesapla(sekiller);
        Kisi kisi=new Kisi();
        //sekillerinAlaniniHesapla(kisi);
        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);
        sekillerinAlaniniHesapla(kisi);
    }

    public static void sekillerinAlaniniHesapla(Object nesne){

        /*if (nesne instanceof Sekiller){
            Sekiller sekiller= (Sekiller) nesne;
            System.out.println("Sekiller nesnesinin alanı: "
                    +sekiller.alanHesapla());
        }*/
        //soldaki obje sağdaki objemidir.
        if (nesne instanceof Dikdortgen){
            Dikdortgen dikdortgen= (Dikdortgen) nesne;
            System.out.println("Dikdortgenin alani: "
                    +dikdortgen.alanHesapla());
        } else if (nesne instanceof  Kare){
            Kare kare= (Kare) nesne;
            System.out.println("Karenin alani: "+kare.alanHesapla());
        }else {
            System.out.println("Bu bir şekil değildir.");
        }

    }

}
