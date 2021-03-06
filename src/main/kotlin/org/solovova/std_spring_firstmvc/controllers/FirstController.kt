package org.solovova.std_spring_firstmvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
//@RequestMapping("/first") //  /first/hello
class FirstController {
   @GetMapping("/hello")
    fun pageHello(): String {
        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun pageGoodBye(): String {
        return "first/goodbye"
    }
}