package myjak.jexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JexampleApplication.class, args);
    }

    public int adder(int a, int b){
        return a+b;
    }
}


