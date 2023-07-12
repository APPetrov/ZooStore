package com.example.bigprojecttinqin.controller;

import com.example.bigprojecttinqin.request.ItemInput;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/zoostore")
public class ItemController {
    ResponseEntity<String> createItem(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.status(201).body("Successfully created item");
    }

//add edit&archive

    //CREATE MORE CONTROLLERS

}
