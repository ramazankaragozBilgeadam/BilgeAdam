package isparcaciklari.ornek2;

public class StartApp {

    public static void main(String[] args) {

        SayiIslemleri islem1=new SayiIslemleri("isPacarcigi1",new Sayilar());

        SayiIslemleri islem2=new SayiIslemleri("isPacarcigi2",new Sayilar());

        islem1.setPriority(5);
        islem2.setPriority(6);
        islem1.start();
        islem2.start();


        System.out.println("isparcacigi1 öncelik: "+islem1.getPriority());
        System.out.println("isparcacigi2 öncelik: "+islem2.getPriority());

        try {
            islem1.join();
            islem2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
