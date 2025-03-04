package com.prod.ems.model;

import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String createdBy;

    private String updatedBy;
}
