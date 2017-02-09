package fr.web3lance.com.bigdata.dao;

import java.io.Serializable;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public interface IDaoImpl <T, PK extends Serializable> {
    /** Persist the newInstance object into database */
    PK create(T newInstance);

    /** Retrieve an object that was previously persisted to the database using
     *   the indicated id as primary key
     */
    T read(PK id);

    /** Save changes made to a persistent object.  */
    void update(T transientObject);

    /** Remove an object from persistent storage in the database */
    void delete(T persistentObject);
}
