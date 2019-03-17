package ornek;

import java.io.IOException;

public class StartApp {

    public static void main(String[] args) {

        DosyaIslemleri dosyaIslemleri=new DosyaIslemleri();

        dosyaIslemleri.setDosyaIsmi("dosya.txt");

        try {
            dosyaIslemleri.dosyaYazma("Java teknoloji topluluğudur.");
            String okunanData=dosyaIslemleri.dosyaOkuma();

            dosyaIslemleri.terstenYazdirma(okunanData);

        } catch (IOException e) {
            System.out.println("Dosya islemleri esnasında bir hata meydana geldi.");
        }


    }

}
