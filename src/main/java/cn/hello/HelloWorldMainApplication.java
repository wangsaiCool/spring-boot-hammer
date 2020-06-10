package cn.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by WangSai on 2020/6/10
 *
 * @SpringBootApplication 标识这是一个SpringBoot应用
 */

@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        // 启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class, args);

    }
}
