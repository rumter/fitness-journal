package ru.rumter.projects.kong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/hello")
    public String hello() {
        return sampleService.getHello();
    }

}
