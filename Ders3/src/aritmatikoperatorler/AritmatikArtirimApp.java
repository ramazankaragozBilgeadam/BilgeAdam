package aritmatikoperatorler;

public class AritmatikArtirimApp {

    public static void main(String[] args){

        int a=2,b=7,c=40,d=50;

        a++; //Değişkenimi ata sonra birkere artır.
        System.out.println("Değişkenimi ata sonra birkere artır. " +a);
        ++b; //Değişkenimi birkere artır sonra ata.
        System.out.println("Değişkenimi birkere artır sonra ata. "+b);
        c--; //Değişkinimi ata sonra birkere azalt.
        System.out.println("Değişkinimi ata sonra birkere azalt. "+c);
        --d; //Değişkenimi birkere azalt sonra ata.
        System.out.println("Değişkenimi birkere azalt sonra ata. "+d);

        int x=7,y=7,sonuc1,sonuc2;

        sonuc1=++x;
        sonuc2=y++;

        System.out.println("Sonuç 1: "+sonuc1);
        System.out.println("Artırımdan sonraki x değeri: "+x);
        System.out.println("Sonuç 2: "+sonuc2);
        System.out.println("Artırımdan sonraki y değeri: "+y);



    }
}
