package koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListNesnesi {

    public static void main(String[] args) {

        List<String> sayilar=new LinkedList<>();

        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        sayilar.add("4");

        ((LinkedList<String>) sayilar).addLast("5");
        ((LinkedList<String>) sayilar).addFirst("0");
        //((LinkedList<String>) sayilar).addFirst("7");

        for (String sayi:sayilar){
            System.out.println(sayi);
        }

        System.out.println("Sondaki eleman siliniyor: "+((LinkedList<String>) sayilar).removeLast());

        Iterator iterator1=sayilar.iterator();
        Iterator iterator2=((LinkedList<String>) sayilar).descendingIterator();
        System.out.println("Linkedlist terst yazdıralım..");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("previous kullanarak tersten yazdırılması");
        Iterator iterator3=sayilar.listIterator(sayilar.size());

        while (((ListIterator) iterator3).hasPrevious()){
            System.out.println(((ListIterator) iterator3).previous());
        }



    }

}
