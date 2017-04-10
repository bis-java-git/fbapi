package fizzbuzzapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fizzbuzzapi")
public class FizzBuzzMain {

    public static void main(String args[]) {
        SpringApplication.run(FizzBuzzMain.class, args);
    }
}
