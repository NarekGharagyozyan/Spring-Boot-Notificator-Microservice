package com.smartcode.notificator.model.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationResponseDto {

    Integer id;

    Integer userId;

    String title;

    String content;

    String description;

    Long notificationDate;

    String email;

}
