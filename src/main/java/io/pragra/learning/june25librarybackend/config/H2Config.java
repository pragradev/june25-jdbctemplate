package io.pragra.learning.june25librarybackend.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.sql.DataSource;

@Configuration
public class H2Config {
//    @Bean
//    public DataSource dataSource(){
//        return DataSourceBuilder
//                .create()
//                .url("jdbc:h2:mem:libraryDB")
//                .username("sa")
//                .password("sa123")
//                .build();
//    }
}
