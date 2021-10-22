package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    /**
     * CommandLineRunner: indicates that a bean should run
     * when it is contained within a SpringApplication
     *
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Alessandro Venturilli", "dev back-end")));
            log.info("Preloading " + repository.save(new Employee("Simone Branzo", "dev android")));
            log.info("Preloading " + repository.save(new Employee("Roberto Bragantino", "dev iOS")));
            log.info("Preloading " + repository.save(new Employee("Giovanni Sentoro", "dev android - external")));
        };
    }
}
