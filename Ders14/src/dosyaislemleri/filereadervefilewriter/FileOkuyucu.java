package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class FileOkuyucu {

    private final static String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {

        BufferedReader a=null;
        FileReader  fileReader=null;
        File file=null;

        try (BufferedReader reader=new BufferedReader(new FileReader(new File(ROOT,"Java.txt")))){

            String data="";
            while ((data=reader.readLine())!=null){
                System.out.println(data);
            }

        } catch (IllegalStateException | IOException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

    }


}
