package fr.web3lance.com.bigdata.dao;

import com.datastax.driver.core.Session;
import fr.web3lance.com.bigdata.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public class VoteDao {
    @Autowired
    Session session;
    public List<Vote> GetList(){

        return null;
    }
}
