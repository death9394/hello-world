/*
 * Copyright 2003-2019 www.e-trans.com.cn
 *
 */
package springcloud_eureka.com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 

/**
 * <p>ClassName: RegisterMain
 * <p>Description: [功能描述]
 * @author heguangning
 * @date 2019年8月28日 下午7:44:13
*/
@SpringBootApplication //spring-boot 启动注解
@EnableEurekaServer // spring-cloud 服务注解
public class RegisterMain{
     public static void main(String [] args) {
    	 new SpringApplicationBuilder(RegisterMain.class).web(true).run(args);
     }
}
