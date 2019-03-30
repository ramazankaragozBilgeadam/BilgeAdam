package isparcasiornek;

public class Depo {

    private String name;
    private int miktar;


    public Depo() {

    }

    public Depo(String name) {
        super();
        this.name = name;
    }

    public synchronized void get() {

        while (miktar == 0) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        miktar--;
        System.out.println(Thread.currentThread().getName() + " alıyor: " + miktar);

        //Ureticilerin beklememesi için notify methodu çağrılıyor.
        //Notify methodu o anki threadin kilidinin açılmasını sağlar.Serbest bırakır.
        notify();
        //notifyAll();

    }

    public synchronized void put() {

        while (miktar == 5) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        miktar++;
        System.out.println(Thread.currentThread().getName()+" koyuyor: "+miktar);
        notify();
    }

    @Override
    public String toString() {
        return this.name+" : "+this.miktar;
    }
}
