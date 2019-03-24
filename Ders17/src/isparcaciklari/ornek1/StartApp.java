package isparcaciklari.ornek1;

public class StartApp {

    public static void main(String[] args) {

        CharYaz charYaz=new CharYaz('a',20);
        SayiYaz sayiYaz=new SayiYaz(1,20);

        Thread th1=new Thread(charYaz);
        th1.start();
        Thread th2=new Thread(sayiYaz);
        th2.start();

    }

}
