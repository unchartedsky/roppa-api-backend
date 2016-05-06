package roppa.apibackend.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import roppa.apibackend.greeting.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by y1sh on 5/6/16.
 */

@Controller
@RequestMapping("/hello-roppa")
public class HelloRoppaController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Roppa") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
