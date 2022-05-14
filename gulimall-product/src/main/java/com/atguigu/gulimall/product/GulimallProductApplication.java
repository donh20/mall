package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1. 整合MyBatis-Plus
*   1) 导入依赖
*       <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus</artifactId>
            <version>3.3.1</version>
        </dependency>
*   2)  配置
*       1. 配置数据源
*           1)导入数据库驱动
*           2)application.yml配置数据源相关信息
*       2. 配置MyBatis-Plus
*           1)使用@MapperScan
*           2)告诉MyBatis-Plus
* 2. 逻辑删除
*   1) 配置逻辑删除规则(省略)
*   2) 配置逻辑删除组件Bean(省略)
*   3) 加上逻辑删除注解@TableLogic
* */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
