package koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNesnesi {

    public static void main(String[] args) {

        Set<String> sayilar=new LinkedHashSet<>();

        sayilar.add("7");
        sayilar.add("2");
        sayilar.add("9");
        sayilar.add("4");
        sayilar.add("4");

        System.out.println("sayilar boyutu: "+sayilar.size());

        for (String sayi:sayilar){
            System.out.println(sayi);
        }

        System.out.println("iterator kullanımı");
        Iterator iterator=sayilar.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
