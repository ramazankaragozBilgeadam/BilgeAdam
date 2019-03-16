package dosyaislemleri.nesneyazma;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NesneYaz {

    private final static String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {

        ObjectOutputStream objeYaz=null;

        File file=new File(ROOT,"personel.ser");

        try {
            file.createNewFile();

            FileOutputStream outputStream=new FileOutputStream(file);

            objeYaz=new ObjectOutputStream(outputStream);

            Personel personel=new Personel();
            personel.setAd("Ali");
            personel.setSoyad("Yılmaz");

            objeYaz.writeObject(personel);


        } catch (IOException e) {
            System.out.println("Dosya oluşturulamadı.");
        }finally {

            try {
                objeYaz.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılamadı.");
            }

        }


    }

}
