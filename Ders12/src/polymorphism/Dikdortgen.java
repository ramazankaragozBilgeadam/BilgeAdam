package polymorphism;

public class Dikdortgen extends Sekiller {

    private double en;
    private double boy;

    public Dikdortgen() {
        String a;
    }

    public Dikdortgen(double en, double boy){
        this.en=en;
        this.boy=boy;
    }



    public double alanHesapla() {
        return this.en*this.boy;
    }


    public double cevreHesapla() {
        return (2*this.en)+(2*this.boy);
    }

    public void setEn(double en){
        this.en=en;
    }

    public double getEn(){
        return this.en;
    }

    public void setBoy(double boy){
        this.boy=boy;
    }

    public double getBoy(){
        return this.boy;
    }



}
