package com.smartcode.notificator.service;

import com.smartcode.notificator.model.dto.NotificationRequestDto;
import com.smartcode.notificator.model.dto.NotificationResponseDto;
import com.smartcode.notificator.model.entity.NotificationEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface NotificationService {
    NotificationResponseDto create(NotificationRequestDto notificationRequestDto);

    List<NotificationResponseDto> getNotifications(Boolean sent, Integer userId);

    NotificationResponseDto createForVerification(NotificationRequestDto notificationRequestDto);

    List<NotificationEntity> getReadyNotifications();

    void sendNotification(NotificationEntity notificationEntity);

}
