/*
 * Copyright 2003-2019 www.e-trans.com.cn
 *
 */
package springcloud_common.com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>ClassName: AppMain
 * <p>Description: [功能描述]
 * @author heguangning
 * @date 2019年8月29日 上午11:53:15
 */
@SpringBootApplication
@EnableEurekaClient // Eureka Client
public class AppMain {
	public static void main(String[] args) {
        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }
}