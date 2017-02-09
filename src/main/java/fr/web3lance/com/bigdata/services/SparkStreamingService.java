package fr.web3lance.com.bigdata.services;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import java.io.IOException;

/**
 * Created by Faliherizo on 09/02/2017.
 */
public class SparkStreamingService {
    public static JavaSparkContext sc;

    public void execute() throws IOException{
        String brokers = "localhost:9092,localhost:9093";
        String topics = "votes";

        SparkConf sparkConf = new SparkConf();


    }
}
