package org.solovova.std_spring_firstmvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class SecondController {
   @GetMapping("/exit")
    fun pageExit(): String {
        return "second/exit"
    }
}