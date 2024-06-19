package com.api.sdbm.controller;

import com.api.sdbm.model.entity.Continent;
import com.api.sdbm.services.ContinentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
@AllArgsConstructor
public class ContinentController {

    private final com.api.sdbm.services.ContinentService ContinentService;

    @GetMapping
    public List<Continent> getAllContinents() {
        return ContinentService.getAllContinents();
    }

    @GetMapping("/{id}")
    public Continent getContinentById(@PathVariable("id") Integer id) {
        return ContinentService.getContinentById(id);
    }

    @PostMapping
    public Continent createContinent(@RequestBody Continent Continent) {
        return ContinentService.createContinent(Continent);
    }

    @PutMapping("/{id}")
    public Continent updateContinent(@PathVariable("id") Integer id, @RequestBody Continent Continent) {
        return ContinentService.updateContinent(id, Continent);
    }

    @DeleteMapping("/{id}")
    public void deleteContinent(@PathVariable("id") Integer id) {
        ContinentService.deleteContinent(id);
    }
}
