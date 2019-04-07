package service;

import dao.PersonelDAO;
import entity.Personel;

import java.util.List;

public class PersonelService implements IPersonelService<Personel> {

    private PersonelDAO personelDAO;

    public PersonelService(){
        this.personelDAO=new PersonelDAO();
    }

    @Override
    public boolean kaydet(Personel personel) {

        if (personel!=null&&personel.getId()==null){

           if (personelDAO.kaydet(personel)){
               return true;
           }

        }

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
    public Personel findById(Personel personel) {
        return null;
    }

    @Override
    public List<Personel> findAll() {
        return personelDAO.listeGetir();
    }
}
