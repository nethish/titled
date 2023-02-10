package com.xample.titled.service;

import com.xample.titled.model.Model;
import com.xample.titled.validator.ModelValidator;

import java.util.HashMap;
import java.util.Map;

public class ModelServiceImpl implements ModelService {
    private Map<Integer, Model> dataById = new HashMap<>();
    private Map<String, Model> dataByName = new HashMap<>();

    @Override
    public Model getModelById(Integer id) {
        if (dataById.containsKey(id)) {
            return dataById.get(id);
        }
        return null;
    }

    @Override
    public Model getModelByName(String name) {
        if (dataByName.containsKey(name)) {
            return dataByName.get(name);
        }
        return null;
    }

    @Override
    public Model putModel(Integer id, String name) {
        Model model = new Model(id, name);
        if (!ModelValidator.validate(model)) {
            return null;
        }
        dataById.put(id, model);
        dataByName.put(name, model);
        return model;
    }
}
