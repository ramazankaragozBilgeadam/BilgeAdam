package innersiniflar;

public class StartApp {


    public static class DiziIslemleri{

        public static void diziYaz(String[] dizi){
            for (String eleman:dizi){
                System.out.println(eleman);
            }
        }
    }

    public static void main(String[] args) {
        Test test=new Test();
        String[] dizi={"Merhaba","Java"};
        DiziIslemleri.diziYaz(dizi);
        StartApp.DiziIslemleri.diziYaz(dizi);
    }
}
