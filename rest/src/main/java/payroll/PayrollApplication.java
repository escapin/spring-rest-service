package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // it fires up a servlet container and serve up our service
//same as
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan --> dice a Spring in quali packages ci sono classi con annotazioni che devono essere gestiste da Spring
public class PayrollApplication {

    public static void main(String... args) {

        SpringApplication.run(PayrollApplication.class, args);
    }
}
