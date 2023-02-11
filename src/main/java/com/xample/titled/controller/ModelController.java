package com.xample.titled.controller;

import com.xample.titled.model.Model;
import com.xample.titled.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelController {
    @Autowired
    ModelService modelService;

    @GetMapping("/api/getModelById/{id}")
    public Model getModelById(@PathVariable Integer id) {
        return modelService.getModelById(id);
    }

    @GetMapping("/api/getModelById/{name}")
    public Model getModelByName(@PathVariable String name) {
        return modelService.getModelByName(name);
    }

    @PostMapping("/api/putModel")
    public Model putModel(@RequestBody Model model) {
        return modelService.putModel(model.getId(), model.getName());
    }
}
