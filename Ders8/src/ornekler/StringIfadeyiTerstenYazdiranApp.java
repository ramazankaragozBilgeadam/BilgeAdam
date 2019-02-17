package ornekler;

public class StringIfadeyiTerstenYazdiranApp {


    public static void main(String[] args) {


        String deger="Merhaba Java"; //avaJ abahreM

        char[] dizi=deger.toCharArray();

        String sonuc="";
        for (int i=dizi.length-1;i>=0;i--){
            sonuc+=dizi[i];
        }

        System.out.println(sonuc);

    }

}
