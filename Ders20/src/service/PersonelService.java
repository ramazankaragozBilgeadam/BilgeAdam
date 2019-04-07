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

        if (personel!=null&&personel.getId()!=null){

            return personelDAO.guncelle(personel);
        }

        return false;
    }

    @Override
    public boolean sil(Personel personel) {

        if (personel!=null&&personel.getId()!=null){
            return personelDAO.sil(personel);
        }

        return false;
    }

    @Override
    public Personel findById(Personel personel) {

        if (personel!=null&&personel.getId()!=null){
            return personelDAO.findById(personel.getId());
        }

        return null;
    }

    @Override
    public List<Personel> findAll() {
        return personelDAO.listeGetir();
    }
}
