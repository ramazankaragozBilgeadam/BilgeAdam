package koleksiyonlar;

import java.util.Stack;

public class Ornek {

    public static void main(String[] args) {

        String ifade="Merhaba Java Dünyası";

        String[] strArr=ifade.split(" ");
        Stack<String> kelimeler=new Stack<>();

        for (String s:strArr) {
            kelimeler.push(s);
        }

        System.out.println("Kelimeler stack boyutu: "+kelimeler.size());
        System.out.println("Kelimeler stackten çıkarılıyor..");
        for (int i=0;i<strArr.length;i++){
            System.out.println(kelimeler.pop());
        }





    }

}
