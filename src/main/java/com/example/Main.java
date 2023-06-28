package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello", List.of("Java", "Golang", "Javascript"), new Person("Alex", 30, 2000.0));
    }

    record Person(String name, int age, double savings) {}

    record GreetResponse(String greet, List<String> favProgrammingLanguage,
                         Person person
                         ) {}
}
