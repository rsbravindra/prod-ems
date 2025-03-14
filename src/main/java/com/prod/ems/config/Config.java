package com.prod.ems.config;

import com.prod.ems.model.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class Config {
    public AuditorAware<Employee> auditorProvider() {
        return Optional::empty;
    }
}
