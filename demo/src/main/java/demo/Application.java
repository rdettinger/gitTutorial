package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.util.StringFunctions;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("This thing did indeed run...");
        StringFunctions strFuncs = new StringFunctions();
        System.out.println("Testing string concatenation: " + strFuncs.concat("Rich", "Dettinger"));
    }
}
