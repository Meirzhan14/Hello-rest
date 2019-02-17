package com.rest.hellorest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class GreetingController {

    Greeting greeting = new Greeting();

    @PostMapping(value = "/greeting",consumes = "application/json")
    public Greeting saveName(@RequestBody Greeting greeting){
        this.greeting = greeting;
        return greeting;
    }
    @GetMapping("/greeting")
    public Greeting getName() {
        return new Greeting("Hello "+ greeting.getName());
    }
}
