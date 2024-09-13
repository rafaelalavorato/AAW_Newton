package com.api.crud.Services;
import org.springframework.stereotype.Service;
@Service
public class HelloServices {
    public String getHello(String name) {
        return String.format("Hello %s!", name);
    
}
}