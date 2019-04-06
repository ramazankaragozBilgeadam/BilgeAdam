package presentation;

import entity.Personel;
import service.PersonelService;

public class PersonelController {

    private PersonelService personelService;

    public PersonelController(){
        this.personelService=new PersonelService();
    }

    public void onPersonelKaydet(Personel personel){
        if (personel!=null){
            if (personelService.kaydet(personel)){
                System.out.println("Personel Kayıt Edildi.");
            }else {
                System.err.println("Personel Kayıt Edilemedi.");
            }
        }
    }

}
