package nesne;

public class StartApp {

    public static void main(String[] args) {


        Dikdortgen dikdortgen=new Dikdortgen();

        System.out.println(dikdortgen.uzunlugu);
        System.out.println(dikdortgen.en);
        System.out.println(dikdortgen.cevre);
        System.out.println(dikdortgen.alan);
        //System.out.println(dikdortgen.a);

        dikdortgen.en=5;
        dikdortgen.uzunlugu=6;

        System.out.println(dikdortgen.en);
        System.out.println(dikdortgen.uzunlugu);

        dikdortgen.cevre=2*dikdortgen.en+2*dikdortgen.uzunlugu;

        System.out.println(dikdortgen.cevre);
        dikdortgen.alan=dikdortgen.en*dikdortgen.uzunlugu;
        System.out.println(dikdortgen.alan);


        Dikdortgen dikdortgen1=new Dikdortgen();
        /*Dikdortgen dikdortgen2=new Dikdortgen();
        Dikdortgen dikdortgen3=new Dikdortgen();*/

        dikdortgen1.uzunlugu=4;
        dikdortgen1.en=2;
        dikdortgen1.cevre=2*dikdortgen1.en+2*dikdortgen1.uzunlugu;
        dikdortgen1.alan=dikdortgen1.en*dikdortgen1.uzunlugu;

        System.out.println("dikdortgen1 alanı: "+dikdortgen1.alan);
        System.out.println("dikdortgen1 çevresi: "+dikdortgen1.cevre);




    }

}
