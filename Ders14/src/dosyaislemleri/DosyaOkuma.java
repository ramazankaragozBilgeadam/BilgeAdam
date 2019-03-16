package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {


    public static void main(String[] args) {

        File file=new File("C:\\DosyaIslemleri\\x.txt");

        if (file.exists()){

            Scanner okuma=null;

            try {
                okuma=new Scanner(file);

                while (okuma.hasNext()){
                    System.out.println(okuma.next());
                }

            } catch (FileNotFoundException e) {
                System.out.println("Dosya bulunamamıştır.");
                System.exit(1);
            }finally {
                okuma.close();
            }


        }else {
            System.out.println("Dosya bulunamamıştır.");
        }

    }

}
