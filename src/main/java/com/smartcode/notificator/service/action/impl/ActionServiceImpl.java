package com.smartcode.notificator.service.action.impl;

import com.smartcode.notificator.mapper.ActionMapper;
import com.smartcode.notificator.model.dto.action.ActionRequestDto;
import com.smartcode.notificator.model.entity.ActionEntity;
import com.smartcode.notificator.repository.ActionRepository;
import com.smartcode.notificator.service.action.ActionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ActionServiceImpl implements ActionService {

    ActionRepository actionRepository;
    ActionMapper actionMapper;

    @Override
    @Transactional
    public void saveAction(ActionRequestDto actionRequestDto) {
        ActionEntity entity = actionMapper.toEntity(actionRequestDto);
        actionRepository.save(entity);
    }
}
