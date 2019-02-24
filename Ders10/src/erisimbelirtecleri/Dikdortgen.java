package erisimbelirtecleri;

public class Dikdortgen {


    private double en;
    private double uzunlugu;


    protected void cevreHesaplama(){

    }

    void alanHesaplama(){

    }


    public double getEn(){
        return this.en;
    }

    public void setEn(double en){
        this.en=en;
    }

    public double getUzunlugu(){
        return this.uzunlugu;
    }

    public void setUzunlugu(double uzunlugu){
        this.uzunlugu=uzunlugu;
    }


  /* public String toString(){
        return "Dikdortgenin eni: "+this.en+" uzunlugu: "+this.uzunlugu;
   }*/

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "en=" + en +
                ", uzunlugu=" + uzunlugu +
                '}';
    }


}
