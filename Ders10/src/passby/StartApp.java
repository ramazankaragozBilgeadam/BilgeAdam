package passby;

public class StartApp {

    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        dikdortgen.en=5;

        passByValue(dikdortgen);

        System.out.println(dikdortgen.en==5);



    }

    public static void passByValue(Dikdortgen dikdortgen){
        dikdortgen=new Dikdortgen();
        dikdortgen.en=6;

    }



}
