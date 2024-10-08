package com.praksix.clairdelune;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

    @RequestMapping(path="/resources/static/", method=RequestMethod.GET)
    public String getHome() {
        // ...
        return "index";
    }
}
