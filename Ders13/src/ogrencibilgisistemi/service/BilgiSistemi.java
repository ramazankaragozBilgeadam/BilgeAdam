package ogrencibilgisistemi.service;

import ogrencibilgisistemi.dersler.Ders;
import ogrencibilgisistemi.domain.Ogrenci;

import java.util.ArrayList;

public class BilgiSistemi implements BilgiSistemiArayuz {

    private ArrayList<Ogrenci> ogrenciListesi;
    private ArrayList<Ders> dersListesi;

    public BilgiSistemi(){
        ogrenciListesi=new ArrayList<>();
        dersListesi=new ArrayList<>();
    }

    @Override
    public double notHesapla(Ogrenci ogrenci) {

        double toplamNot=0;
        double notOrtalamasi=0;
        double toplamKatsayisi=0;

        if (ogrenci!=null){

            ArrayList<Ders> dersListesi=ogrenci.getDersListesi();

            if (dersListesi!=null&&dersListesi.size()>0) {

                for (Ders ders : dersListesi) {
                    toplamKatsayisi+=ders.getKatSayisi();
                    toplamNot=toplamNot+ders.getPuan()*ders.getKatSayisi();
                }

                notOrtalamasi=toplamNot/(ogrenci.getDersSayisi()+toplamKatsayisi);

            }
        }

        return notOrtalamasi;
    }

    @Override
    public void ogrenciKaydet(Ogrenci ogrenci) {

        if (ogrenci!=null){
            ogrenciListesi.add(ogrenci);
        }

    }

    @Override
    public void dersKaydet(Ders ders) {
        if (ders!=null){
            dersListesi.add(ders);
        }
    }

    @Override
    public boolean dersDurumunaBak(Ogrenci ogrenci) {

        if (ogrenci!=null){
            if (ogrenci.getNotOrtalamasi()>=50){
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Ogrenci> ogrenciListesiGetir() {
        return this.ogrenciListesi;
    }

    @Override
    public ArrayList<Ders> dersListesiGetir() {
        return this.dersListesi;
    }

    @Override
    public void ogrenciListesiYaz(ArrayList<Ogrenci> ogrenciListesi) {

        if (ogrenciListesi!=null&&ogrenciListesi.size()>0){

            for (Ogrenci ogrenci:ogrenciListesi){
                System.out.println(ogrenci);
            }

        }
    }

    @Override
    public void dersListesiYaz(ArrayList<Ders> dersListesi) {

        if (dersListesi!=null&&dersListesi.size()>0){

            for (Ders ders:dersListesi){
                System.out.println(ders);
            }
        }

    }
}
