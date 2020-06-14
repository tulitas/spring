package com.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class SiteController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/loginpage")
    public ModelAndView loginpage() {
        System.out.println("555");
        return new ModelAndView("loginpage");
    }

    @RequestMapping("/admin")
    public ModelAndView admin() {
        System.out.println("admin");
        return new ModelAndView("adminn");
    }

    @RequestMapping("/news")
    public ModelAndView news() {
        return new ModelAndView("news");
    }

    @RequestMapping("/registration")
    public ModelAndView registration() {
        return new ModelAndView("registration");
    }

}
