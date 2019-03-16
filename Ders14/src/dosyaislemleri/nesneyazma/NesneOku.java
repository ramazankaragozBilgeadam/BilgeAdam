package dosyaislemleri.nesneyazma;

import java.io.*;

public class NesneOku {

    private static final String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {

        ObjectInputStream objectInputStream=null;

        File file=new File(ROOT,"personel.ser");

        Personel personel=null;

        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);

            while (true){
                personel= (Personel) objectInputStream.readObject();
                System.out.println(personel);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamamıştır.");
        } catch (ClassNotFoundException e) {
            System.out.println("Personel sınıfı bulunamadı.");
        }catch (EOFException e){
            return;
        } catch (IOException e) {
            System.out.println("Dosya okuma sırasında hata meydana geldi.");
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Personelin adı: "+personel.getAd());
        }



    }

    public static String donus(){

        return "Merhaba";
    }

}
