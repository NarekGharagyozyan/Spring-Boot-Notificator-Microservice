package com.smartcode.notificator.model.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationRequestDto {

    Integer userId;

    String title;

    String content;

    String description;

    Long notificationDate;

    Long createDate;

    Boolean sent;

    String email;

}
