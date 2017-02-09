package fr.web3lance.com.bigdata.dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Faliherizo on 09/02/2017.
 */
@Configuration
public class CassandraSessionManager {
    private Session session;
    private Cluster cluster;

    @Value("${contactPoint}")
    private String contactPoint;

    @Value("${keyspace}")
    private String keyspace;

    public CassandraSessionManager() {

    }

    public Session getSession() {
        return session;
    }

    @PostConstruct
    public void initIt() {
        cluster = Cluster.builder().addContactPoint(
                contactPoint).build();
        session = cluster.connect(keyspace);
    }

    @PreDestroy
    public void destroy() {
        if (session != null) {
            session.close();
        }
        if (cluster != null) {
            cluster.close();
        }
    }
}
