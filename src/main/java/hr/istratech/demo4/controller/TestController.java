package hr.istratech.demo4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TestController {

    @GetMapping
    public String test() {return "Test successful";}

    @PostMapping
    public String testPost() {return "Test successful";}
}
