package dao;

import entity.Personel;

import java.util.List;

public class PersonelDAO extends BaseDAO<Personel> {

    @Override
    public boolean kaydet(Personel personel) {
        return false;
    }

    @Override
    public boolean guncelle(Personel personel) {
        return false;
    }

    @Override
    public boolean sil(Personel personel) {
        return false;
    }

    @Override
    public List<Personel> listeGetir() {
        return null;
    }

    @Override
    public Personel findById(Long id) {
        return null;
    }
}
