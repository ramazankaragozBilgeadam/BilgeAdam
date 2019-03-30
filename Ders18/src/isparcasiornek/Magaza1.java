package isparcasiornek;

public class Magaza1 extends Thread {

    private Depo monitorDepo;
    private Depo klavyeMouseDepo;
    private Depo kasaDepo;

    public Magaza1() {

    }

    public Magaza1(Depo monitorDepo, Depo klavyeMouseDepo, Depo kasaDepo) {
        super("Magaza1");
        this.monitorDepo = monitorDepo;
        this.klavyeMouseDepo = klavyeMouseDepo;
        this.kasaDepo = kasaDepo;
    }

    @Override
    public void run() {

        //İş parçacığı her seferinde 1500 ms uyku moduna geçiyor daha sonra
        //kaldığı yerden devam ediyor.while true olduğu için bu işlemi tekrar, tekrar yapıyor.
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread 3000 ms bekle süresi bitikten sonra
            //Depo nesnelerin de get mothodu yardımyla miktarı 1 azaltıyor.
            monitorDepo.get();
            klavyeMouseDepo.get();
            kasaDepo.get();
        }

    }
}
