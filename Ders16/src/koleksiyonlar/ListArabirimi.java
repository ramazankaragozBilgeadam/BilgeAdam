package koleksiyonlar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArabirimi {

    public static void main(String[] args) {

        List<String> renkler=new ArrayList<>();

        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");
        renkler.add("Turuncu");

        for (String renk:renkler){
            System.out.println(renk);
        }

        if (renkler.contains("Yeşil")){
            System.out.println("Listede yeşil mevcut.");
        }

        List<String> renkler2=new ArrayList<>();

        renkler2.add("Siyah");
        renkler2.add("Beyaz");

        renkler.addAll(renkler2);

        Iterator iterator=renkler.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        renkler.removeAll(renkler2);
        System.out.println("renkler2 listesi silindi.");
        yaz(renkler);

        System.out.println("2.indexdeki elemanı getir: "+renkler.get(2));


    }

    public static void yaz(List<String> liste){

        if (liste.size()>0) {
            Iterator iterator = liste.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}
