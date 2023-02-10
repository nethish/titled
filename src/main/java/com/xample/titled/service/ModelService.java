package com.xample.titled.service;

import com.xample.titled.model.Model;

public interface ModelService {
    /**
     * Get Model data by id
     * @param id Integer
     * @return @Model
     */
    Model getModelById(Integer id);

    /**
     * Get Model by name
     * @param name String
     * @return @Model
     */
    Model getModelByName(String name);

    Model putModel(Integer id, String name);
}
