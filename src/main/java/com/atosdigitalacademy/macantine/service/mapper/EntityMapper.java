package com.atosdigitalacademy.macantine.service.mapper;

import com.atosdigitalacademy.macantine.models.Menu;

public interface EntityMapper <D, E>{
    D toDto(E entity);
    E toEntity(D dto);
}
