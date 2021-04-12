package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private SchoolCRUD repo;

    @GetMapping(path="/add")
    public @ResponseBody String add(@RequestParam String name, @RequestParam Integer year) {
        School s = new School();
        s.setName(name);
        s.setOpenyear(year);
        repo.save(s);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<School> getAllSchools() {
        return repo.findAll();
    }
}
