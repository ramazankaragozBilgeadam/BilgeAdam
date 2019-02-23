//Sınıfımın hangi pakette olduğu bilgisi.
package nesne;

//Sınıfımıza import edilen sınıflar burda belirtilir.
import java.util.Scanner;

public class Dikdortgen {

    /*
    *Sınıf içerisinde verilen değişkenler sınıf değişkenleridir.
    * O sınıfın özellikleridir.(Properties)
     */
    Scanner scanner=new Scanner(System.in);
    public double uzunlugu;
    public double en;
    public double cevre;
    public double alan;
    //public Double a=new Double(0);
    public static int sayi;

    public static final double PI=3.14;

    //sadece class ismi verilir
    //Dönüş tipi yoktur.
    public Dikdortgen(){
        //this keyword ile class değişkenlerinden bahsediyor olacağız.
        //this.uzunlugu=5;
        //this.en=6;
        //uzunlugu=5;
        //en=6;
    }

    public Dikdortgen(int uzunlugu,int en){
        this.uzunlugu=uzunlugu;
        this.en=en;
    }



    public void alanHesapla(){

        this.alan=this.en*this.uzunlugu;

        System.out.println("Dikdörtgenimin alanı: "+alan);

    }

    public void alanHesapla(double uzunlugu,double en){
        double sonuc=uzunlugu*en;
        System.out.println("Parametre alak Dikdörtgenin alan hesabı: "+sonuc);
    }

    public double alanHesapla(double alan,double en,double cevre){
        return alan;
    }


    public void cevreHesapla(){

        this.cevre=(2*this.en)+(2*this.uzunlugu);

        System.out.println("Dikdörtgenimin çevresi: "+this.cevre);

    }









}
