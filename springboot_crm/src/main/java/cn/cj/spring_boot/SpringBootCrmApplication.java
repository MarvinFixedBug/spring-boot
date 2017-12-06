package cn.cj.spring_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.cj.spring_boot.dao")
public class SpringBootCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrmApplication.class, args);
    }
}
