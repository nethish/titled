package com.xample.titled;

import com.xample.titled.service.ModelService;
import com.xample.titled.service.ModelServiceImpl;

public class Main {
    public static void main(String[] args) {
        ModelService modelService = new ModelServiceImpl();
        modelService.putModel(1, "one");
        modelService.putModel(2, "tow");
        System.out.println(modelService.getModelById(1));
        System.out.println(modelService.getModelByName("tow"));
    }
}
