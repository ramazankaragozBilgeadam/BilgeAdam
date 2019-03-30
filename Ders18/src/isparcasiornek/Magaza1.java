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

        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            monitorDepo.get();
            klavyeMouseDepo.get();
            kasaDepo.get();
        }

    }
}
