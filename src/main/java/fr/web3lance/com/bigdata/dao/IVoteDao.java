package fr.web3lance.com.bigdata.dao;

import fr.web3lance.com.bigdata.model.Vote;

import java.util.List;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public interface IVoteDao {
    public List<Vote> GetList();
}
