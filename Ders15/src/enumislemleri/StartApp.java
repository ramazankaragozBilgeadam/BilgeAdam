package enumislemleri;

public class StartApp {


    public static void main(String[] args) {

        System.out.println(HaftaninGunleri.PAZAR);
        System.out.println(HaftaninGunleri.valueOf("CUMARTESI"));

        System.out.println("Haftanın günleri");
        for (HaftaninGunleri gun:HaftaninGunleri.values()){
            System.out.println(gun);
        }

        System.out.println(HaftaninGunleri.PAZARTESI.getValue()+" haftanın "
                +HaftaninGunleri.PAZARTESI.getKey()+". günüdür.");


        System.out.println("");
        System.out.println("Haftanın günleri:");
        for (HaftaninGunleri gun:HaftaninGunleri.values()){
            System.out.println(gun.getValue()+" haftanın "+gun.getKey()
                    +". günüdür.Özet: "+gun.getOzet());
        }

    }

}
