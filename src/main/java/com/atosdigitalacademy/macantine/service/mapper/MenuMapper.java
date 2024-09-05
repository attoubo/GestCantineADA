package com.atosdigitalacademy.macantine.service.mapper;

import com.atosdigitalacademy.macantine.models.Menu;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public interface MenuMapper extends EntityMapper <MenuDTO, Menu>{
}
