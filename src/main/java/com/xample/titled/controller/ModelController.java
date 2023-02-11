package com.xample.titled.controller;

import com.xample.titled.model.Model;
import com.xample.titled.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ModelController {
    @Autowired
    ModelService modelService;

    @GetMapping("/")
    public String test() {
        return "Hi there!";
    }

    @GetMapping("/api/getModelById")
    public Model getModelById(@RequestParam Integer id) {
        return modelService.getModelById(id);
    }

    @GetMapping("/api/getModelByName")
    public Model getModelByName(@RequestParam String name) {
        return modelService.getModelByName(name);
    }

    @PostMapping(
            value = "/api/putModel",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public Model putModel(@RequestBody Model model) {
        return modelService.putModel(model.getId(), model.getName());
    }

    @PostMapping(
            value = "/api/putModelRaw",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public Model putModelRaw(@RequestBody Map<String, Object> payload) {
        Integer id = (Integer) payload.get("id");
        String name = (String) payload.get("name");
        return modelService.putModel(id, name);
    }
}
