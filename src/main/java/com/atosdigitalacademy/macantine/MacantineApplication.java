package com.atosdigitalacademy.macantine;

import com.atosdigitalacademy.macantine.models.Menu;
import com.atosdigitalacademy.macantine.models.Plat;
import com.atosdigitalacademy.macantine.service.MenuService;
import com.atosdigitalacademy.macantine.service.PlatService;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;
import com.atosdigitalacademy.macantine.service.mapper.MenuMapper;
import com.atosdigitalacademy.macantine.service.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
@Service
@Slf4j
public class MacantineApplication implements CommandLineRunner {

	private final MenuService menuService;
	private final PlatService platService;
	private final PlatMapper platMapper;
	private final MenuMapper menuMapper;
//	private


	public static void main(String[] args) {
		SpringApplication.run(MacantineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		MenuDTO menu = new MenuDTO();
//		menu.setCreationDate(LocalDate.now());
//		menuService.save(menu);
//
//		MenuDTO menu1 = new MenuDTO();
//		menu1.setCreationDate(LocalDate.now());
//		menuService.save(menu1);
//
//
//
//
//
//		PlatDTO plat = new PlatDTO();
//		plat.setName("Foutou sauce graine");
//		plat.setSummary("Puree de banane ou foutou avec sauce graine");
//		platService.save(plat);
//
//
//		PlatDTO plat1 = new PlatDTO();
//		plat1.setName("Gari sans sucre");
//		plat1.setSummary("semoule de manioc sec sans huile");
//		platService.save(plat1);
//
//
//		PlatDTO plat2 = new PlatDTO();
//		plat2.setName("Garba sans huile");
//		plat2.setSummary("semoule de manioc cuite sans huile");
//		platService.save(plat2);


//		platService.delete(plat2);
	}
}
