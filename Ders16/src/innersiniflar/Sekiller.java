package innersiniflar;

abstract class Sekiller {
    public abstract void alanHesapla();
}

interface SekillerArayuz{
    void tanim();
}

class Kare extends Sekiller implements SekillerArayuz{

    private double kenar;

    public Kare(){

    }

    public Kare(double kenar){
        this.kenar=kenar;
    }


    public void setKenar(double kenar){
        this.kenar=kenar;
    }

    public double getKenar(){
        return this.kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(Math.pow(this.kenar,2));
    }

    @Override
    public void tanim() {
        System.out.println("Ben bir kareyim.");
    }
}

class Dikdortgen extends Sekiller implements SekillerArayuz{

    private double en;
    private double boy;

    public Dikdortgen(){

    }

    public Dikdortgen(double en, double boy){
        this.en=en;
        this.boy=boy;
    }


    @Override
    public void alanHesapla() {
        System.out.println(this.en*this.boy);
    }

    @Override
    public void tanim() {
        System.out.println("Ben bir dikdortgenim.");
    }

    public double getBoy() {
        return this.boy;
    }

    public double getEn() {
        return this.en;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void setEn(double en) {
        this.en = en;
    }

}

class StartApp2{

    public static void main(String[] args) {

        Sekiller sekiller=new Kare();
        ((Kare) sekiller).setKenar(2);
        sekiller.alanHesapla();
        ((Kare) sekiller).tanim();


        sekilAlanlari(new Dikdortgen(2,3));


    }

    public static void sekilAlanlari(Sekiller sekiller){
        sekiller.alanHesapla();
    }

}



