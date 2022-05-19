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
*   4) 分组校验(多场景的复杂校验)
*       1) @NotBlank(message="品牌名称不能为空",groups = {AddGroup.class, UpdateGroup.class})
*           给注解校验标注什么情况需要进行校验
*       2) @Validated({AddGroup.class})
*       3) 默认没有指定分组的校验注解@NotBlank,在分组校验的时候@Validated({AddGroup.class})不生效,只会在@Validated生效
*   5) 自定义校验
*       1) 编写一个自定义校验注解
*       2) 编写一个自定义校验器
*       3) 管理自定义的校验器和自定义注解
            @Documented
            @Constraint(validatedBy = {ListValueConstraintValidator.class}[可以指定多个不同的校验器,适配不同类型的校验])
            @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
            @Retention(RUNTIME)
            public @interface ListValue {
* 4. 给一个统一的异常处理
* @ControllerAdvice
*   1) 编写异常处理类,使用@ControllerAdvice
*   2) 使用@ExceptionHandler标注方法可以处理的异常
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
