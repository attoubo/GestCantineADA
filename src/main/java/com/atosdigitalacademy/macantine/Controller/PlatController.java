package com.atosdigitalacademy.macantine.Controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("plats")
@Slf4j
@RequiredArgsConstructor
public class PlatController {

    @GetMapping
    public String showPlat(){
        log.debug("Request to show plats");

        return "/plats/list";
    }

    @PostMapping("/create")
    public String createPlat(){
        log.debug("Request to create plats");
        return "/plats/form";
    }
}
