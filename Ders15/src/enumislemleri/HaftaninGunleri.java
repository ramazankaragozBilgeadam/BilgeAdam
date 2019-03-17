package enumislemleri;

public enum HaftaninGunleri {

    PAZARTESI(1,"Pazartesi","Hafta İçi"),
    SALI(2,"Salı","Hafta İçi"),
    CARSAMBA(3,"Çarşamba","Hafta İçi"),
    PERSEMBE(4,"Perşembe","Hafta İçi"),
    CUMA(5,"Cuma","Hafta İçi"),
    CUMARTESI(6,"Cumartesi","Hafta Sonu"),
    PAZAR(7,"Pazar","Hafta Sonu");

    private Integer key;
    private String value;
    private String ozet;


    private HaftaninGunleri(Integer key,String value,String ozet){
        this.key=key;
        this.value=value;
        this.ozet=ozet;

    }


    public Integer getKey(){
        return this.key;
    }

    public void setKey(Integer key){
        this.key=key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOzet() {
        return ozet;
    }

    public void setOzet(String ozet) {
        this.ozet = ozet;
    }
}
