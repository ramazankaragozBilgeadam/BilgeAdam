package abstraction;

public class StartApp {

    public static void main(String[] args) {

        Hayvan hayvan=new Balik();

        //hayvan=new Kus();
        hayvan.tanim();
        hayvan.hareket();
        hayvan.yemek();

        System.out.println();

        Hayvan newHayvan=new Kus();

        newHayvan.tanim();
        newHayvan.yemek();
        newHayvan.hareket();

    }
}
