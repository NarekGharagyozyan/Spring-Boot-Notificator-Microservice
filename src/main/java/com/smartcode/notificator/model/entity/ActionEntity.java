package com.smartcode.notificator.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "action")
public class ActionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    String actionType;

    String entityType;

    LocalDateTime actionDate;

    Integer userId;
}
