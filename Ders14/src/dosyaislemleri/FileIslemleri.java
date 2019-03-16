package dosyaislemleri;

import java.io.File;
import java.io.IOException;

public class FileIslemleri {

    private final static String ROOT = "C:\\DosyaIslemleri";


    public static void main(String[] args) {


        File file = new File(ROOT);

        if (file.isFile()) {

            System.out.println("Bu uzantısı olan bir dosyadır.");

        } else if (file.isDirectory()) {
            System.out.println("Bu bir klasördür.");
            System.out.println("Klasörün ismi: " + file.getName());
            System.out.println("Bir önceki klasör: " + file.getParent());
            System.out.println("Klasörün uzantısı: " + file.getPath());

            double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);
            double terabytes = (gigabytes / 1024);
            System.out.println("Kalasörün byte cinsinden boyutu: " + bytes);

            System.out.println("İçerisindeki dosyalar: ");
            for (String dosyaIsimleri : file.list()) {
                System.out.println(dosyaIsimleri);

                if (dosyaIsimleri.equals("A")) {
                    File aFile = new File(ROOT + "\\" + dosyaIsimleri);
                    if (aFile.isDirectory()) {
                        System.out.println("A klasörü içerisindeki dosyalar:");
                        for (String a : aFile.list()) {
                            System.out.println(a);
                        }
                        break;
                    }

                }
            }

            File yeni = new File(ROOT, "yeniKlasör");

            yeni.mkdir(); //klasör oluşturma
            //yeni.deleteOnExit();


        } else {
            System.out.println("Dosya ya da klasör bulunamadı.");
        }

    }

}
