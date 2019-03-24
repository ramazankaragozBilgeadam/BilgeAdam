package isparcaciklari.ornek2;

public class SayiIslemleri extends Thread{

    private Sayilar sayilar;
    private String threadName;
    private Thread th;

    public SayiIslemleri(){

    }

    public SayiIslemleri(String threadName,Sayilar sayilar){
        this.threadName=threadName;
        this.sayilar=sayilar;
    }


    @Override
    public void start() {
        System.out.println(threadName+" isimli thread başlatıldı..");
       if (th==null){
           th=new Thread(this,threadName);
           th.start();
       }
    }

    @Override
    public void run() {

        synchronized (sayilar){
            sayilar.sayiYaz();
        }

        System.out.println(threadName+" isimli thread sonlandırıldı.");

    }


}
