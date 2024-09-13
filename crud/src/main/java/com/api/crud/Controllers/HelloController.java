package com.api.crud.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.api.crud.Services.HelloServices;


@RestController
public class HelloController {
@Autowired
private HelloServices helloService;
@GetMapping("/")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return helloService.getHello(name);
}
}
