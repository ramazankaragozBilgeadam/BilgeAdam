package tasarimsablonlari.singleton;

public class SingletonDesignPattern {


    private static SingletonDesignPattern instance;


    private SingletonDesignPattern(){

    }

    public void tanim(){
        System.out.println("Ben birkere üretilen bir nesneyim.");
    }

    public static SingletonDesignPattern getInstance(){

        if (instance==null){
            instance=new SingletonDesignPattern();
        }
        return instance;
    }

}
