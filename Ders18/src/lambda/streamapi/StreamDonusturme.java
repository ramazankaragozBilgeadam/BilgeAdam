package lambda.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDonusturme {

    public static void main(String[] args) {
        List<String> liste= Arrays.asList("","Ali","Yeşil","","Yedi","","Bir");

        System.out.println("Liste yazdırılıyor...");
        liste.stream().forEach(System.out::println);

        List<String> yeniListe=liste.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());

        System.out.println("Yeni liste yazdırılıyor..");
        yeniListe.stream().forEach(System.out::println);


        streamKullanmasaydik(liste);



    }


    public static void streamKullanmasaydik(List<String> liste){

        System.out.println("Stream Api Kullanasaydık.....");

        List<String> yeniListe=new ArrayList<>();

        if (liste.size()>0){

            for (String str:liste){

                if (!str.isEmpty()){
                    yeniListe.add(str);
                }

            }

            listeYaz(yeniListe);

        }
    }

    public static void listeYaz(List<String> liste){

        if (liste.size()>0){

            for (String yaz:liste){
                System.out.println(yaz);
            }
        }

    }





}
