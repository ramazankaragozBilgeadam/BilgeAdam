package isparcaciklari.ornek1;

public class CharYaz implements Runnable {

    private char karekter;
    private int yazmaSayisi;
    private int i;

    public CharYaz() {

    }

    public CharYaz(char karekter, int yazmaSayisi) {
        this.karekter = karekter;
        this.yazmaSayisi = yazmaSayisi;
    }

    @Override
    public void run() {

        try {
            for (i = 0; i < yazmaSayisi; i++) {
                if (i == 1) {
                    //Thread.sleep(5000);
                    Thread.yield();
                }
                System.out.print(karekter);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
