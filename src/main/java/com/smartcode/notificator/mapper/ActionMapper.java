package com.smartcode.notificator.mapper;

import com.smartcode.notificator.model.dto.action.ActionRequestDto;
import com.smartcode.notificator.model.entity.ActionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActionMapper {

    ActionEntity toEntity(ActionRequestDto actionRequestDto);
}
