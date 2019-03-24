package isparcaciklari;

public class StartApp {

    public static void main(String[] args) {

        IsParcasi isParcasi=new IsParcasi();

        Thread isParcacigi=new Thread(isParcasi);

        isParcacigi.setName("isparcacigi1");
        System.out.println("Thread ismi: "+isParcacigi.getName());
        System.out.println(isParcacigi.getName()+" olan thread'in öceliği "
                +isParcacigi.getPriority());
        System.out.println("Thread start edilmeden yaşama durumu: "+isParcacigi.isAlive());
        isParcacigi.start();
        System.out.println("Thread start edildikten sonra yaşama durumu: "+isParcacigi.isAlive());


    }

}
