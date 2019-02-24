package kalitim2;

public class Personel extends Kisi {

    private long sicilNumarasi;

    public Personel() {
    }

    public long getSicilNumarasi() {
        return sicilNumarasi;
    }

    public void setSicilNumarasi(long sicilNumarasi) {
        this.sicilNumarasi = sicilNumarasi;
    }


    @Override
    public String kisiBilgileri() {
        return "Personel Bilgileri: "+super.kisiBilgileri()
                +" Sicil Numarası: "+sicilNumarasi;
    }


}
