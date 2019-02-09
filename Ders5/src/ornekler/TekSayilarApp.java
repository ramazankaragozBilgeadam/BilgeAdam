package ornekler;


//1'den 100'e kadar olan tek sayılar..
public class TekSayilarApp {

    public static void main(String[] args) {

        int i;
        String tekSayilar="";

        for (i=0;i<=100;i++){

            if (i%2==1){
                tekSayilar=tekSayilar+i+" ";
                //""+"3"+" " "3 " tekSayilar="3 ";
                //"3 "+"5"+" "  "3 5 "   tekSayilar="3 5 ";
            }
        }

        System.out.println(tekSayilar);



    }

}
