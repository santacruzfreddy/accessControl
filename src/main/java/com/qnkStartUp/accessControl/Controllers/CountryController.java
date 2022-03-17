package com.qnkStartUp.accessControl.Controllers;

import com.qnkStartUp.accessControl.model.entity.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/country")
public class CountryController {

    @PostMapping(name = "/create")
    public ResponseEntity<String> create(@RequestBody Country country) {
        try {

        } catch (Exception ex) {

        }
        return null;
    }

    @PutMapping(name = "/update")
    public ResponseEntity<String> update() {
        try {

        } catch (Exception ex) {

        }
        return null;
    }

    @GetMapping(name = "/search")
    public ResponseEntity<String> search() {
        try {

        } catch (Exception ex) {

        }
        return null;
    }

}
