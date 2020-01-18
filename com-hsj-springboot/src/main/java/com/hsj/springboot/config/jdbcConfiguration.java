package com.hsj.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration  //申明一个类是java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
//@EnableConfigurationProperties(jdbcProperties.class) //启用配置文件
public class jdbcConfiguration {

//    //方法1
//    @Autowired
//    private jdbcProperties jdbcProperties;

    //方法2注入
//    public jdbcConfiguration(jdbcProperties jdbcProperties){
//        this.jdbcProperties=jdbcProperties;
//    }

    //方法3 可以直接写在下面的形参中，直接调用
    //public DataSource dataSource(jdbcProperties jdbcProperties){
//    @Bean  //把方法的返回值注入到spring容器中
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
//        dataSource.setUrl(this.jdbcProperties.getUrl());
//        dataSource.setUsername(this.jdbcProperties.getUsername());
//        dataSource.setPassword(this.jdbcProperties.getPassword());
//        return dataSource;
//    }

    //方法4
    @Bean  //把方法的返回值注入到spring容器中
    @ConfigurationProperties(prefix = "jdbc")  //自动调用set方法进行设置，赋值
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
