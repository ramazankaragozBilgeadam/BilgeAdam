package methodlar;

public class OrneklerApp {

    public static void main(String[] args) {

        helloMethod();
        sayiYaz(50);
        int sonuc=10+20;
        sayiYaz(sonuc);

        toplamaIslemi(5,3);

        int gelenDeger=donusTipiOlanToplamaIslemi(7,2);
        System.out.println("Donus tipi olan toplama islemi: "+gelenDeger);
        int result=donusTipiOlanToplamaIslemi(3,6)+1;
        System.out.println("sonuc: "+result);


    }

    //return tipi olmayan ve parametre alamayan method
    //static olmasının sebebi static method'tan çağırabilmek için.
    public static void helloMethod(){
        System.out.println("Hello Method..");
    }

    //Dönüş tipi olmayan parametre alan method
    public static void sayiYaz(int sayi){
        System.out.println("Sayınız: "+sayi);
    }

    //Dönüş tipi olmayan 1den fazla parametre alan method
    public static void toplamaIslemi(int sayi1,int sayi2){

        int sonuc=sayi1+sayi2;
        System.out.println("Toplama işlemi sonucu: "+sonuc);

    }

    //Dönüş tipi olan ve parametre alan method.
    public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2){

        int sonuc=sayi1+sayi2;

        return sonuc;
    }


    public static short test(int sayi1,int sayi2){
        return (short) (sayi1+sayi2);
    }

}
