package io.sqm.app.controller;

import io.sqm.app.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public Example showHomePage() {
        Example example = new Example();
        example.setName("Hi...");
        return example;
    }

}
