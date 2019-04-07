package dao;

import entity.Personel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonelDAO extends BaseDAO<Personel> {


    @Override
    public boolean kaydet(Personel personel) {
        //super.openConnection();

        String sorgu = "insert into public.\"Personel\"(adi,soyadi,tc_no,tel,dogum_tarihi) values (?,?,?,?,?)";
        try {
            openConnection();
            PreparedStatement preparedStatement = getConnection().prepareStatement(sorgu);
            preparedStatement.setString(1, personel.getAdi());
            preparedStatement.setString(2, personel.getSoyadi());
            preparedStatement.setString(3, personel.getTcNo());
            preparedStatement.setString(4, personel.getTel());
            preparedStatement.setDate(5, personel.getDogumTarihi());

            //return executeUpdate(preparedStatement);
            if (executeUpdate(preparedStatement)) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return false;
    }

    @Override
    public boolean guncelle(Personel personel) {
        return false;
    }

    @Override
    public boolean sil(Personel personel) {
        return false;
    }

    @Override
    public List<Personel> listeGetir() {

        List<Personel> personelList=null;

        try {
            String sorgu="select * from public.\"Personel\"";
            openConnection();
            PreparedStatement preparedStatement=getConnection().prepareStatement(sorgu);
            ResultSet resultSet=super.execute(preparedStatement);

            if (resultSet!=null) {
                personelList = new ArrayList<>();

                while (resultSet.next()) {
                    Personel personel = new Personel();

                    personel.setId(resultSet.getLong("id"));
                    personel.setAdi(resultSet.getString("adi"));
                    personel.setSoyadi(resultSet.getString("soyadi"));
                    personel.setTel(resultSet.getString("tel"));
                    personel.setDogumTarihi(resultSet.getDate("dogum_tarihi"));
                    personel.setTcNo(resultSet.getString("tc_no"));

                    personelList.add(personel);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }

        return personelList;
    }

    @Override
    public Personel findById(Long id) {
        return null;
    }
}
