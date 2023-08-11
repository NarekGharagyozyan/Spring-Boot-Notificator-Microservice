package com.smartcode.notificator.model.dto.notification;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

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
