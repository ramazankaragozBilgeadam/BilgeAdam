package ikiboyutludizi;

public class IkiBoyutluDiziApp {


    public static void main(String[] args) {


        int satir=3,sutun=4;

        int[][] dizi=new int[satir][sutun];

        System.out.println("Dizinin boyutu: "+dizi.length);
        System.out.println("Dizinin sutun boyutu: "+dizi[0].length);


        int sayac=0;

        for (int i=0;i<dizi.length;i++){

            for (int k=0;k<dizi[i].length;k++){

                dizi[i][k]=++sayac;

            }

        }


        //Satır sayısının boyutuna erişmek için dizi.length kullanıyoruz.
        for (int i=0;i<dizi.length;i++){

            //Her bir satırdaki sutun sayısına erişebilmek için
            //dizi[i].length kullanıyoruz
            for (int k=0;k<dizi[i].length;k++){

                System.out.print(dizi[i][k]+" ");
            }
            System.out.println();

        }




    }
}
