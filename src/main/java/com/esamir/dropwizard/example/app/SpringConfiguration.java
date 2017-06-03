package com.esamir.dropwizard.example.app;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
//@EnableTransactionManagement
//@ImportXml("classpath:com/company/app/datasource-config.xml")
@ComponentScan(basePackageClasses = SpringConfiguration.class)
public class SpringConfiguration {

    @Autowired
    Environment environment;



    @Bean
    DataSource dataSource() {
        BasicDataSource
            DataSource ds = new org.apache.commons.dbcp2.BasicDataSource();
            ds.
            ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            ds.setUrl("jdbc:oracle:thin:@firefly:1521:HRP2");
            ds.setUsername("scott");
            ds.setPassword("tiger");
            return ds;
        /*
         <property name="url" value="${db.url}" />
       <property name="driverClassName" value="${db.driver}" />
       <property name="username" value="${db.username}" />
       <property name="password" value="${db.password}" />
         */
        new BasicDataSource()

    }




}
