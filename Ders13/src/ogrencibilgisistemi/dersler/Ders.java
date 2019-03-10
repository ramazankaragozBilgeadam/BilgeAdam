package ogrencibilgisistemi.dersler;

public abstract class Ders {

    private String dersAdi;
    private Double katSayisi;
    private Double puan;

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public Double getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(Double katSayisi) {
        this.katSayisi = katSayisi;
    }

    public Double getPuan() {
        return puan;
    }

    public void setPuan(Double puan) {
        this.puan = puan;
    }


    @Override
    public String toString() {
        return "Ders{" +
                "dersAdi='" + dersAdi + '\'' +
                ", katSayisi=" + katSayisi +
                ", puan=" + puan +
                '}';
    }
}
