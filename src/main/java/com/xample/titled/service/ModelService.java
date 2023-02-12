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

    /**
     * Create data point
     * @param id Integer
     * @param name String
     * @return Returns created model
     */
    Model putModel(Integer id, String name);
}
