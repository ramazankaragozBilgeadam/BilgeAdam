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
