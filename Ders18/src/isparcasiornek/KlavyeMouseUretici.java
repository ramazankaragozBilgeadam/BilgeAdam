package isparcasiornek;

public class KlavyeMouseUretici extends Thread {

    private Depo depo;

    public KlavyeMouseUretici(){

    }

    public KlavyeMouseUretici(Depo depo){
        super("KlavyeMouseUreticisi");
        this.depo=depo;
    }

    @Override
    public void run() {

        //İş parçacığı her seferinde 1500 ms uyku moduna geçiyor daha sonra
        //kaldığı yerden devam ediyor.while true olduğu için bu işlemi tekrar, tekrar yapıyor.
        while (true) {
            try {

                sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //depodaki ürün miktarını senkron bir şekilde 1 artıroyor.
            depo.put();
        }


    }
}
