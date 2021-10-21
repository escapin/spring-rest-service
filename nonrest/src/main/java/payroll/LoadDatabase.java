package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Employee("Alessandro Venturelli", "dev back-end")));
            log.info("Preloading" + repository.save(new Employee("Simone Branzi", "dev android")));
            log.info("Preloading" + repository.save(new Employee("Roberto Bragantini", "dev iOS")));
            log.info("Preloading" + repository.save(new Employee("Giovanni Santoro", "dev android - external")));
        };
    }
}
