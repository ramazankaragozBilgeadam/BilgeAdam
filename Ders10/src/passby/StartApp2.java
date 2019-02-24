package passby;

public class StartApp2 {

    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();

        dikdortgen.en=5;

        passByReferance(dikdortgen);
        System.out.println(dikdortgen.en==5);

    }


    public static void passByReferance(Dikdortgen dikdortgen){

        dikdortgen.en=10;

    }

}
