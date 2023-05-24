package com.example.springbootboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.example.springbootboard.controller
 * fileName       : HomeController
 * author         : son-jia
 * date           : 2023-05-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-24        son-jia       최초 생성
 */

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
