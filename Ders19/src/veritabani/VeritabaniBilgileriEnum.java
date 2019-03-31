package veritabani;

public enum VeritabaniBilgileriEnum {

    DATABASE_URL("jdbc:postgresql://localhost:5432/postgres?currentSchema=public"),
    KULLANICI_ADI("postgres"),
    SIFRE("root");


    private String value;

    private VeritabaniBilgileriEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }

}
