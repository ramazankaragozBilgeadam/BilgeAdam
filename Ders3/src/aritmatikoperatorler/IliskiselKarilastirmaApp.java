package aritmatikoperatorler;

public class IliskiselKarilastirmaApp {

    public static void main(String[] args) {
        int a=5,b=10;
        // < , <= , >, >=, ==, !=
        boolean sonuc;
        sonuc=a<b;
        System.out.println("A'nın B'den küçük olma durumu: "+sonuc);
        System.out.println(a<b);
        sonuc=a>b;
        System.out.println("A'nın B'den büyük olma durumu: "+sonuc);
        sonuc=a<=b;
        System.out.println("A'nın B'den küçük eşit olma durumu: "+sonuc);
        int c=5;
        sonuc=a<=c;
        System.out.println("A'nın C'den küçük eşit olma durumu: "+sonuc);
        sonuc=a>=b;
        System.out.println("A'nın b'den büyük eşit olma durumu: "+sonuc);
        sonuc=a==b;
        System.out.println("A'nın b'ye eşit olma durumu: "+sonuc);
        sonuc=a!=b;
        System.out.println("A'nın b'ye eşit olmama durumu: "+sonuc);




    }

}
