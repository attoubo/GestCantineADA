package com.atosdigitalacademy.macantine.service;

import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    MenuDTO save(MenuDTO menuDTO);
    MenuDTO update(MenuDTO menuDTO);
    Optional<MenuDTO> findOne(Long id);
    List<MenuDTO> findAll();
//    Optional<MenuDTO> findByName(String name);

    void delete(Long id);
}
