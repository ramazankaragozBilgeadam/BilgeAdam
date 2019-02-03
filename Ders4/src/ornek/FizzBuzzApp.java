package ornek;

public class FizzBuzzApp {


    /**
     * 100e kadar olan sayılarda
     * sayının 3'e bölündüğün de fizz
     * sayının 5'e bölündüğün de buzz
     * sayının 15'e bölündüğünde fizzbuzz
     *
     * yazması bekleniyor.
     */
    public static void main(String[] args) {

        int i;

        for (i=1;i<100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if (i%3==0){
                System.out.println("fizz");
            }else if (i%5==0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }

    }
}
