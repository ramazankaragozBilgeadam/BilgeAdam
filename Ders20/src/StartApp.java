import dao.PersonelDAO;
import entity.Personel;
import presentation.PersonelView;

import java.sql.Date;

public class StartApp {

    public static void main(String[] args) {

       PersonelView personelView=new PersonelView();
       personelView.menu();


  /*      PersonelDAO  personelDAO=new PersonelDAO();

        Personel personel=new Personel();
        personel.setAdi("Ali");
        personel.setSoyadi("Yılmaz");
        personel.setTcNo("123123");
        personel.setDogumTarihi(Date.valueOf("2019-01-15"));
        personel.setTel("123456");

        personelDAO.kaydet(personel);*/




    }

}
