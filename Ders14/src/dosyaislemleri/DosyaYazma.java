package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {

    public static void main(String[] args) {

        File file=new File("C:\\DosyaIslemleri\\deneme.txt");

        System.out.println(file.exists());

        if (file.exists()){

            PrintWriter yazici=null;

            try {
                yazici=new PrintWriter(file);

                yazici.write("Merhaba Java.");
                //throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("Dosya bulunamadı.");
            }finally {
                yazici.close();
            }

            System.out.println("Dosyamız mevcuttur.");

        }

    }
}
