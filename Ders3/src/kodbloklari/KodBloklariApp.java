package kodbloklari;

public class KodBloklariApp {


    public static void main(String[] args) {

        int a=5;
        System.out.println("Kademe1 a degeri: "+a);
        {
            a=3;
            System.out.println("kademe 2 a degeri: "+a);
            {
                int b=10;
                a=2;
                System.out.println("kademe 3 "+"a degeri: "+a+" b değeri: "+b);
                {
                    b=7;
                    System.out.println("kademe 4 "+"a degeri: "+a+" b değeri: "+b);
                }
            }
        }

    }
}
