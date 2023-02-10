package com.xample.titled.service;

import com.xample.titled.model.Model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelServiceImplTest {
    private static ModelService modelService = new ModelServiceImpl();
    private static Model modelA = new Model(1, "one");
    private static Model modelB = new Model(2, "tow");

    @BeforeAll
    public static void init() {
        modelService.putModel(1, "one");
        modelService.putModel(2, "tow");
    }

    @Test
    @Timeout(5)
    public void testGetModelById() throws InterruptedException {
        // Uncomment the below line to fail the test
        // Thread.sleep(10_000);
        assertEquals(modelService.getModelById(2), modelA);
    }

    @Test
    public void testGetModelByName() {
        assertEquals(modelService.getModelByName("tow"), modelB);
    }
}
