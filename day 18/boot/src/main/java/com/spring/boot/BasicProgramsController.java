/*
 * Problem statement:
 * Create beginner-friendly web endpoints that demonstrate an if/else
 * condition, multiple conditions for calculating a grade, and an OOP example.
 * Each endpoint should receive input from the browser and return a message.
 *
 * Hint:
 * @RestController returns the method result as the HTTP response.
 * @GetMapping connects a browser GET request to a Java method.
 * @RequestParam reads values such as ?number=7 from the URL.
 * For other request types, use @PostMapping to submit/create data,
 * @PutMapping to update data, and @DeleteMapping to delete data.
 */
package com.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicProgramsController {

    @GetMapping("/basics/even-or-odd") // localhost:8080/basics/even-or-odd?number=89
    public String evenOrOdd(@RequestParam int number) {
        if (number % 2 == 0) {
            return number + " is even.";
        }
        return number + " is odd.";
    }

    @GetMapping("/basics/grade")
    public String grade(@RequestParam int marks) {
        if (marks < 0 || marks > 100) {
            return "Marks must be between 0 and 100.";
        } else if (marks >= 90) {
            return "Grade A";
        } else if (marks >= 75) {
            return "Grade B";
        } else if (marks >= 50) {
            return "Grade C";
        }
        return "Grade F";
    }

    @GetMapping("/basics/person")
    public String person(@RequestParam String name, @RequestParam int age) {
        Person person = new Person(name, age);
        return person.introduce();
    }
}

