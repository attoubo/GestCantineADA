package com.atosdigitalacademy.macantine.service.mapper.impl;

import com.atosdigitalacademy.macantine.models.Plat;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;
import com.atosdigitalacademy.macantine.service.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@RequiredArgsConstructor
@Component
public class PlatMapperImpl implements PlatMapper {

    private final ModelMapper modelMapper;


    @Override
    public PlatDTO toDto(Plat entity) {
        return modelMapper.map(entity, PlatDTO.class);
    }

    @Override
    public Plat toEntity(PlatDTO dto) {
        return modelMapper.map(dto, Plat.class);
    }
}
