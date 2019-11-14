package com.whjbatisgenerate.whj_batis_generate.config;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.whjbatisgenerate.whj_batis_generate.dao")
public class DaoConfig{
}

