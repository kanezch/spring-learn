package com.kanezheng.app.webfluxdemo.helloannotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public Mono<String> handle(){
        return Mono.just("Hello WebFlux");
    }
}
