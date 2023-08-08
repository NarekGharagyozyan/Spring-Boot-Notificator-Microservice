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
@Validated
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationRequestDto {

    @NotNull
    Integer userId;

    @NotBlank
    String title;

    @NotBlank
    String content;

    @NotBlank
    String description;

    @NotNull
    Long notificationDate;

    @NotNull
    Long createDate;

    @NotNull
    Boolean sent;

    @NotBlank
    String email;

}
