package nesne;

public class StartApp2 {

    public static void main(String[] args) {


        Dikdortgen dikdortgen1=new Dikdortgen();

        dikdortgen1.alan=5;

        System.out.println("dikdörtgen1 alanı: "+dikdortgen1.alan);
        Dikdortgen dikdortgen2=new Dikdortgen();

        //dikdortgen1 artık dikdortgen2'nin heap'de oluşturduğu
        //yeni objeyi (örneklendirme/instance) refer ettiği için
        //refer ettiği örneklendirme'nin değerlerini alır.
        //dikdortgen1'in önceden refer ettiği örneklendirme ,
        // gc tarafından yok edilir.(Destroy edilir.)

        dikdortgen1=dikdortgen2;

        System.out.println("dikdörtgen1 alanı: "+dikdortgen1.alan);

        dikdortgen1.alan=6;
        System.out.println("dikdörtgen1 alanı: "+dikdortgen1.alan);


    }

}
