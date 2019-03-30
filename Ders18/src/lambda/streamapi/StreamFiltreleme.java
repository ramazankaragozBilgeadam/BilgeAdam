package lambda.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamFiltreleme {

    public static void main(String[] args) {

        String[] sayilar={"bir","iki","üç","yedi","dokuz","on","onbir"};

        //Dizinin Arrays sınıfı kullanarak List arabirimine dönüştürülmesi.
        List<String> sayiListesi= Arrays.asList(sayilar);

        long count;

        count=sayiListesi.stream().filter(x->x.length()>3).count();

        System.out.println("Uzunluğu 3'ten büyükolan kayıtların sayısı: "+count);

        String[] dizi={"Ali","Mavi","Ali","Yeşil","Ali"};

        count= Arrays.stream(dizi).filter(isim->isim.equals("Ali")).count();

        System.out.println("İsmi Ali olanların sayısı: "+count);





    }


}
