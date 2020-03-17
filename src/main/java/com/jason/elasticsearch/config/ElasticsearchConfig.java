package com.jason.elasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

   @Bean//(name = "restHightLevelClient")
    public RestHighLevelClient restHighLevelClient() {


       return new RestHighLevelClient(
               RestClient.builder(
                       new HttpHost("localhost", 9200, "http")));
    }
}