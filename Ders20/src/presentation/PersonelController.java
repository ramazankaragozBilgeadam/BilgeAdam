package presentation;

import entity.Personel;
import service.PersonelService;

import java.util.List;

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


    public List<Personel> onPersonelList(){

        List<Personel> personelList=personelService.findAll();

        if (personelList!=null&&personelList.size()>0){
            System.out.println("Personel Listeleme İşlemi Başarılı.");
        }else {
            System.err.println("Personel Listesi bulunamadı.");
        }

        return personelList;
    }

    public Personel onPersonelById(Long id){

        Personel personel=new Personel();
        personel.setId(id);

        if ((personel=personelService.findById(personel))!=null){
            System.out.println("Personel bulundu..");
            return personel;
        }else {
            System.err.println("Personel ne yazıkki bulunamadı!!");
            return null;
        }
    }

}
