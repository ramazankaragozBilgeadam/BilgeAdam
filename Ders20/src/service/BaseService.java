package service;

import java.util.List;

public interface BaseService<T> {

    boolean kaydet(T t);
    boolean guncelle(T t);
    boolean sil(T t);
    T findById(T t);
    List<T> findAll();

}
