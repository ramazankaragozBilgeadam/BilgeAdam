package koleksiyonlar;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {

    public static void main(String[] args) {

        Queue<String> kuyruk=new LinkedList<>();

        //eleman eklemek için offer kullanılır.
        kuyruk.offer("a");
        kuyruk.offer("1");
        kuyruk.offer("b");
        kuyruk.offer("c");

        ((LinkedList<String>) kuyruk).addFirst("x");
        ((LinkedList<String>) kuyruk).addLast("y");

        System.out.println("Çıkarılan eleman: "+kuyruk.poll());

        //ilk elemanı çıkartır.
        kuyruk.poll();

        for (String k:kuyruk) {
            System.out.println(k);
        }

        System.out.println("Kuyruktaki ilk eleman: "+kuyruk.peek());
        System.out.println("Kuyruktaki ilk eleman: "+((LinkedList<String>) kuyruk).peekFirst());
        System.out.println("Kuyruktaki son eleman: "+((LinkedList<String>) kuyruk).peekLast());

    }

}
