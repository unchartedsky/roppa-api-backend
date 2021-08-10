package roppa.apibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = "roppa.apibackend")
@EnableTransactionManagement
public class RoppaConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(RoppaConfiguration.class, args);
    }

}