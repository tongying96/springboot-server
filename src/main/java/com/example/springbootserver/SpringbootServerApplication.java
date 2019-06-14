package com.example.springbootserver;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 可视化监控步骤：1、建一个springbootserver应用
* 服务器端       2、在GitHub上搜索spring boot admin添加依赖<groupId>de.codecentric</groupId>
			                                            <artifactId>spring-boot-admin-starter-server</artifactId>
														<version>2.1.3</version>
			    3、修改启动类，加@EnableAdminServer注解
  客户端         1、添加pom依赖<groupId>de.codecentric</groupId>
							 <artifactId>spring-boot-admin-starter-client</artifactId>
							 <version>2.1.3</version>
  				2、修改配置文件management.endpoints.web.exposure.include=*
  							 spring.boot.admin.url=http://localhost:9090
* */
@SpringBootApplication
//@EnableAdminServer
public class SpringbootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServerApplication.class, args);
	}

}
