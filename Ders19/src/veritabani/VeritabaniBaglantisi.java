package veritabani;

import java.sql.*;

public class VeritabaniBaglantisi {


    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver sınıfı bulundu.");
        } catch (ClassNotFoundException e) {
            System.err.println("Postgresql driver sınıfı bulunamadı.");
        }
        Connection conn=null;

        try {
            conn= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public",
                    "postgres","root");
            System.out.println("Veritabanı bağlantısı gerçekleşti.");

            String sorgu="INSERT INTO public.\"Personel\" (ad,soyad,tc_no,tel,dogum_tarihi) VALUES(?,?,?,?,?)";

            PreparedStatement statement=conn.prepareStatement(sorgu);

            statement.setString(1,"Can");
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
            System.err.println("Veritabanına bağlanamadı.");
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                    System.out.println("Bağlantı kapatıldı.");
                } catch (SQLException e) {
                    System.err.println("Bağlantı katılamadı.");
                    e.printStackTrace();
                }
            }
        }


    }

}
