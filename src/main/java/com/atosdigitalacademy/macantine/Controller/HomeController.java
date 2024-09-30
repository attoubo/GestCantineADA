package com.atosdigitalacademy.macantine.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    @GetMapping
    public String home(Model model) {
        log.debug("home page");

        return "/home/dashboard";

    }
}

