package koleksiyonlar;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackNesnesi {

    public static void main(String[] args) {

        Stack<String> sayi=new Stack<>();

        sayi.push("1");
        sayi.push("2");
        sayi.push("3");
        sayi.push("4");

        System.out.println("Elamanım nerede: "+sayi.search("3"));

        for (String s:sayi){
            System.out.println(s);
        }

        System.out.println("Çıkarılan eleman: "+sayi.pop());
        sayi.pop();

        for (String s:sayi){
            System.out.println(s);
        }

        System.out.println("Iterator ile yazılması");
        Iterator iterator=sayi.listIterator(sayi.size());

        while (((ListIterator) iterator).hasPrevious()){
            System.out.println(((ListIterator) iterator).previous());
        }

    }
}
