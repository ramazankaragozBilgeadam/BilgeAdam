package jeneriksiniflar;

public class DiziIslemleriJenerik<Genel> {

    public void diziYaz(Genel[] genel){

        for (Genel g:genel){
            System.out.println(g);
        }

    }

}
