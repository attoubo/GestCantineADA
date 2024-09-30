package com.atosdigitalacademy.macantine.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menus")
@Slf4j
@RequiredArgsConstructor
public class MenuController {

    @GetMapping
    public String ShowMenus(){
        log.debug("Request to show menus");

        return "/menus/list";
    }

    @PostMapping("/create")
    public String createMenus(){
        log.debug("Request to create menus");
        return "/menus/form";
    }

}
