package fr.web3lance.com.bigdata.dao;

import java.io.Serializable;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public class DaoImpl  <T, PK extends Serializable>
        implements IDaoImpl<T, PK> {


    @Override
    public PK create(T newInstance) {
        return null;
    }

    @Override
    public T read(PK id) {
        return null;
    }

    @Override
    public void update(T transientObject) {

    }

    @Override
    public void delete(T persistentObject) {

    }
}
