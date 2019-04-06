package dao;

import java.sql.*;
import java.util.List;

public abstract class BaseDAO<T> {

    private Connection connection;


    public void openConnection(){
        try {
            connection= DriverManager.getConnection(VeritabaniBilgileri.CONNECTION_URL.getValue()
                    ,VeritabaniBilgileri.USERNAME.getValue()
                    ,VeritabaniBilgileri.PASSWORD.getValue());
            System.out.println("Veritabanı bağlantısı sağlandı.");
        } catch (SQLException e) {
            System.err.println("Veritabanına bağlanılamadı!!!!");
            e.printStackTrace();
        }
    }

    public void closeConnection(){

        if (connection!=null){
            try {
                connection.close();
                System.out.println("Veritabanı bağlantısı kapatıldı..");
            } catch (SQLException e) {
                System.err.println("Veritabanı bağlantısı kapatılamadı!!!!");
                e.printStackTrace();
            }
        }

    }

    public boolean executeUpdate(PreparedStatement preparedStatement){

        int status=0;

        try {
            status=preparedStatement.executeUpdate();

            if (status==1){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    public ResultSet execute(PreparedStatement preparedStatement){
        ResultSet resultSet=null;

        try {
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    //save
    public abstract boolean kaydet(T t);
    //update()
    public abstract boolean guncelle(T t);
    //delete()
    public abstract boolean sil(T t);
    //findAll()
    public abstract List<T> listeGetir();
    //Belirli bir id'ye gore obje getiren method
    public abstract T findById(Long id);



    public Connection getConnection(){
        return this.connection;
    }
}
