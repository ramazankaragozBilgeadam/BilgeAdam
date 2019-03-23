package koleksiyonlar;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Vector;

public class VectoNesnesi {

    public static void main(String[] args) {

        Vector<String> renkler=new Vector<>();
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");
        renkler.add("Turuncu");

        for (String renk:renkler){
            System.out.println(renk);
        }

        Iterator iterator=renkler.iterator();
        System.out.println("Iterator ile yazılması...");

        String temp="";
        while (iterator.hasNext()){
            temp= (String) iterator.next();
            if (temp.equals("Mavi")){
                iterator.remove();
                temp="";
            }
            System.out.println(temp);
        }

        System.out.println("iterator son durum");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
