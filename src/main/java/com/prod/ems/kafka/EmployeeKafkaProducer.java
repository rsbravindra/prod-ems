package com.prod.ems.kafka;

import com.prod.ems.model.Employee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeKafkaProducer {

    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendEmployeeCreationEvent(Employee employee) {
        String message = "Employee Created" + employee.getName();
        kafkaTemplate.send("employee-topic", message);
    }
}
