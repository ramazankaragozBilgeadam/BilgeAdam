package methodovarloading;

public class Dikdortgen {

    public double en;
    public double uzunlugu;
    public double alan;
    public double cevre;

    public void alanHesapla(){

        //alan
        this.alan=this.uzunlugu*this.en;

        System.out.println("Dikdortgen alani: "+alan);

    }

    public void alanHesapla(final double en,final double uzunlugu){
        this.alan=en*uzunlugu;
        System.out.println("Dikdortgen alani: "+this.alan);
    }

    public void alanHesapla(double en,double uzunlugu,double cevre){

        this.alan=en*uzunlugu;
        System.out.println("Dikdortgenin alani: "+alan);
        System.out.println("Dikdortgenin cevresi: "+cevre);
    }

    public double alanHesapla(double alan){

        return alan;
    }



}
