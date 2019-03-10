package ogrencibilgisistemi.service;

import ogrencibilgisistemi.dersler.Ders;
import ogrencibilgisistemi.domain.Ogrenci;

public interface BilgiSistemiArayuz extends BaseBilgiSistemiArayuz {

    double notHesapla(Ogrenci ogrenci);
    void ogrenciKaydet(Ogrenci ogrenci);
    void dersKaydet(Ders ders);
    boolean dersDurumunaBak(Ogrenci ogrenci);
}
