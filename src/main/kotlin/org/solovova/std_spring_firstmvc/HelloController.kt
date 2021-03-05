package org.solovova.std_spring_firstmvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HelloController {
    @GetMapping("/hello-world")
    fun sayHello(): String {
        return "hello_world"
    }

    @GetMapping("/")
    fun sayStart(): String {
        return "hello_start"
    }
}