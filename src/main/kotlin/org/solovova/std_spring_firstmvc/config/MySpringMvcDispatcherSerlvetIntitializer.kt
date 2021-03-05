package org.solovova.std_spring_firstmvc.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer


class MySpringMvcDispatcherSerlvetIntitializer :
    AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(SpringConfig::class.java)
    }

    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }
}