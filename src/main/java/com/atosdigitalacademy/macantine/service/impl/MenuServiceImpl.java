package com.atosdigitalacademy.macantine.service.impl;

import com.atosdigitalacademy.macantine.Repository.MenuRepository;
import com.atosdigitalacademy.macantine.models.Menu;
import com.atosdigitalacademy.macantine.service.MenuService;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import com.atosdigitalacademy.macantine.service.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@ToString
@Service
@Slf4j
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        log.debug("Saving User:{}", menuDTO);

        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);

        return menuMapper.toDto(menu);
    }

    @Override
    public MenuDTO update(MenuDTO platDTO) {
        return null;
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return menuRepository.findById(id).map(menu -> {
            return menuMapper.toDto(menu);
        });
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll().stream().map(menu -> {
            return menuMapper.toDto(menu);
        }).toList();
    }

//    @Override
//    public Optional<MenuDTO> findByName(String name) {
//        return m.findByName(name).map(menu -> menuMapper);
//    }

    @Override
    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}
