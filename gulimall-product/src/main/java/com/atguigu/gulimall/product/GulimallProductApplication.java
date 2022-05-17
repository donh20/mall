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
* 3. JSR303
*   1) 给Bean添加校验注解: javax.validation.constraints,并定义自己的message提示
*   2) 开启校验功能@Valid
*       效果: 校验错误以后,会有默认的响应;
*   3) 给校验的bean后加一个BindingResult,就可以获取到校验的结果
* 4. 给一个统一的异常处理
* @ControllerAdvice
*
* */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
