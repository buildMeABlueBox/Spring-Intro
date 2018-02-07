package com.ajk.controller;

import com.ajk.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloMongoController {

    @Autowired
    private UsersRepository usersRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public ModelAndView helloWorld(ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("index");
        List users = usersRepo.findAll();
        modelAndView.addObject("users", users);
        return modelAndView;
    }

}
