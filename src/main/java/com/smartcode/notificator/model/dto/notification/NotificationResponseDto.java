package com.smartcode.notificator.model.dto.notification;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Setter
@Getter
public class NotificationResponseDto {

    private Integer id;

    private Integer userId;

    private String title;

    private String content;

    private String description;

    private Long notificationDate;

    private String email;
}