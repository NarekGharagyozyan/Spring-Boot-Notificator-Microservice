package com.smartcode.notificator.controller;

import com.smartcode.notificator.model.dto.action.ActionRequestDto;
import com.smartcode.notificator.model.dto.notification.NotificationResponseDto;
import com.smartcode.notificator.service.action.ActionService;
import com.smartcode.notificator.util.constants.Path;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping(Path.ACTION)
public class ActionController {

    ActionService actionService;

    @PostMapping(Path.SAVE)
    public ResponseEntity<Void> saveAction(@RequestBody ActionRequestDto actionRequestDto) {
        actionService.saveAction(actionRequestDto);
        return ResponseEntity.ok().build();
    }

}
