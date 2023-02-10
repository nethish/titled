package com.xample.titled.validator;

import com.xample.titled.model.Model;

import java.util.Objects;

public class ModelValidator {
    public static boolean validate(Model model) {
        return !Objects.isNull(model.getId()) && !Objects.isNull(model.getName());
    }
}
