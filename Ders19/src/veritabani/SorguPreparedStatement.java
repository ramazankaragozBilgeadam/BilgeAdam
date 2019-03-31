package veritabani;

import java.sql.*;

public class SorguPreparedStatement {

    public static void main(String[] args) {

        Connection conn=null;

        try {
            conn= DriverManager.getConnection(VeritabaniBilgileriEnum.DATABASE_URL.getValue()
                    ,VeritabaniBilgileriEnum.KULLANICI_ADI.getValue()
                    ,VeritabaniBilgileriEnum.SIFRE.getValue());
            System.out.println("Bağlantı sağlandı.");

            String sorgu="INSERT INTO public.\"Personel\" (ad,soyad,tc_no,tel,dogum_tarihi) VALUES(?,?,?,?,?)";

            PreparedStatement statement=conn.prepareStatement(sorgu);

            statement.setString(1,"Veli");
            statement.setString(2,"Güt");
            statement.setString(3,"12345678912");
            statement.setString(4,"5312565654");
            statement.setDate(5, Date.valueOf("1989-05-15"));

            int durum=statement.executeUpdate();

            if (durum==1){
                System.out.println("Veri ekleme işlemi gerçekleştirildi.");
            }else {
                System.err.println("Veri eklenemedi!!");
            }


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
