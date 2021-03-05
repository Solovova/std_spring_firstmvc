package org.solovova.std_spring_firstmvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
class HelloController {
   // @GetMapping("/hello-world")
   @GetMapping("/hello")
    fun sayHello(): String {
        return "hello_world"
    }

    @GetMapping("/")
    fun sayStart(): String {
        return "hello_start"
    }
}