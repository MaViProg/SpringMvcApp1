package ru.ikonnikova.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping ("/hello-world")
    public String sayHello(){
        //возвращаем пользователю представление
    return "hello_world";

    }
}
