package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SorguPreparedStatement {

    public static void main(String[] args) {

        Connection conn=null;

        try {
            conn= DriverManager.getConnection(VeritabaniBilgileriEnum.DATABASE_URL.getValue()
                    ,VeritabaniBilgileriEnum.KULLANICI_ADI.getValue()
                    ,VeritabaniBilgileriEnum.SIFRE.getValue());
            System.out.println("Bağlantı sağlandı.");




        } catch (SQLException e) {
            System.err.println("Bağlantı gerçekleştirilemedi.");
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                    System.out.println("Bağlantı kapatıldı.");
                } catch (SQLException e) {
                    System.err.println("Bağlantı kaptılma esnasında bir sorun çıktı.");
                    e.printStackTrace();
                }
            }
        }

    }
}
