package isparcasiornek;

public class MonitorUretici extends Thread {

    private Depo depo;

    public MonitorUretici() {

    }

    public MonitorUretici(Depo depo) {
        super("MonitorUreticisi");
        this.depo = depo;
    }

    @Override
    public void run() {

        while (true) {
            try {
                sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depo.put();
        }

    }
}
