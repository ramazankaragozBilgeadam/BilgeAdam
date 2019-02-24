package kalitim2;

public class Ogrenci extends Kisi {

    private long okulNumarası;

    public Ogrenci() {
        //superden once alt sınıfa değer atanamaz.
        //once super sınıfın objesinin oluşturulması gerekir.
        //this.okulNumarası=12;
        super("ramazan","karagoz",27);
        super.setAd("sadas");
        super.setYas(12);

    }

    public long getOkulNumarası() {
        return okulNumarası;
    }

    public void setOkulNumarası(long okulNumarası) {
        this.okulNumarası = okulNumarası;
    }

    @Override
    public String kisiBilgileri() {
        return "Ogrenci Bilgisi: "+super.kisiBilgileri()
                +" okul numarasi: "+this.okulNumarası;
    }


}
