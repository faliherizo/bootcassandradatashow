package com.example;

import com.datastax.driver.core.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Faliherizo on 09/02/2017.
 */
@Configuration
public class AppBeans {
    @Bean
    public Session session() {
        return sessionManager().getSession();
    }

    @Bean
    public CassandraSessionManager sessionManager() {
        return new CassandraSessionManager();
    }
}
