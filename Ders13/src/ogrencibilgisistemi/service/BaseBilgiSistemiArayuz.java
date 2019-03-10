package ogrencibilgisistemi.service;

import ogrencibilgisistemi.dersler.Ders;
import ogrencibilgisistemi.domain.Ogrenci;

import java.util.ArrayList;

public interface BaseBilgiSistemiArayuz {

    ArrayList<Ogrenci> ogrenciListesiGetir();

    ArrayList<Ders> dersListesiGetir();

    void ogrenciListesiYaz(ArrayList<Ogrenci> ogrenciListesi);

    void dersListesiYaz(ArrayList<Ders> dersListesi);

}
