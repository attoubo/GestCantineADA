package com.atosdigitalacademy.macantine.service.impl;

import com.atosdigitalacademy.macantine.Repository.PlatRepository;
import com.atosdigitalacademy.macantine.models.Plat;
import com.atosdigitalacademy.macantine.service.PlatService;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;
import com.atosdigitalacademy.macantine.service.mapper.PlatMapper;
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
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private final PlatMapper platMapper;

    @Override
    public PlatDTO save(PlatDTO platDTO) {
        log.debug("Saving plat: {}", platDTO);

        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return platMapper.toDto(plat);
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return platRepository.findById(id).map(plat -> {
            return platMapper.toDto(plat);
        });
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDto(plat);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        platRepository.deleteById(id);
    }

}
