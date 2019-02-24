package kalitim2;

public class Kisi {

    private String ad;
    private String soyad;
    private int yas;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }


    public String kisiBilgileri(){
        return "Adi: "+this.ad+" Soyadi: "+this.soyad+" Yaş: "+this.yas;
    }

    public String getAd(){
        return this.ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
