package entity;

import java.sql.Date;

public class Personel {

    private Long id;
    private String adi;
    private String soyadi;
    private String tcNo;
    private String tel;
    private Date dogumTarihi;

    public Personel() {
    }

    public Personel(Long id, String adi, String soyadi, String tcNo, String tel, Date dogumTarihi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcNo = tcNo;
        this.tel = tel;
        this.dogumTarihi = dogumTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", tel='" + tel + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
