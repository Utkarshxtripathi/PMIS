/*
 * Problem statement:
 * Create a simple web page that prints "Anish Mia San Mia" when a user opens
 * the application's root URL.
 *
 * Hint:
 * @RestController makes this class handle web requests and returns text
 * directly. @GetMapping("/") connects an HTTP GET request for "/" to print().
 * You can use @PostMapping, @PutMapping, or @DeleteMapping for other HTTP
 * actions when creating, updating, or deleting data.
 */
package com.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class printHello {
    @GetMapping("/")
    public String print(){
        return "Anish";
    }

}

