package com.example.bai5;

import com.example.bai5.model.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bai5Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai5Application.class, args);
        Company company = (Company) context.getBean("company");
        System.out.println("Company: " + company.getName());
    }

    @Bean(name = "company")
    public Company getCompany(){
        return new Company("Folly", "Logo");
    }
}
