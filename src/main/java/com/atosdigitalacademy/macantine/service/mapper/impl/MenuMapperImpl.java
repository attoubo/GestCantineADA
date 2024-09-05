package com.atosdigitalacademy.macantine.service.mapper.impl;

import com.atosdigitalacademy.macantine.models.Menu;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import com.atosdigitalacademy.macantine.service.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class MenuMapperImpl implements MenuMapper {

    private final ModelMapper modelMapper;

//    public MenuMapper(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }

    public MenuDTO toDto(Menu menu) {
        return modelMapper.map(menu, MenuDTO.class);
    }

    public Menu toEntity(MenuDTO menuDTO) {
        return modelMapper.map(menuDTO, Menu.class);
    }

}
