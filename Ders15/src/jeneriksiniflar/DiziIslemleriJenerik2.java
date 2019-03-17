package jeneriksiniflar;

public class DiziIslemleriJenerik2<T> implements DiziIslemleriArayuz<T>{


    @Override
    public void diziYaz(T[] g) {

        for (T t:g) {

            System.out.println(t);
        }

    }
}
