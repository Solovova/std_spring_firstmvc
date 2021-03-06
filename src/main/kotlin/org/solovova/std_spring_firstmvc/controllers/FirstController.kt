package org.solovova.std_spring_firstmvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest


@Controller
//@RequestMapping("/first") //  /first/hello
class FirstController {
    @GetMapping("/hello")
    fun pageHello(request: HttpServletRequest): String {
        val name = request.getParameter("name")
        println(name)
        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun pageGoodBye(@RequestParam(defaultValue = "", required = false, name = "name") name1: String): String {
        println(name1)
        return "first/goodbye"
    }
}