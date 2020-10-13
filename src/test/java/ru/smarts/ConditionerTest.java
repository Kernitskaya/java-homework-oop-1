package ru.smarts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    void testIncreaseTemperature() {
        conditioner.setMaxTemperature(1);
        conditioner.increaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    void testIncreaseMaxTemperature() {
        conditioner.setMaxTemperature(0);
        conditioner.increaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    void testDecreaseTemperature() {
        conditioner.setMinTemperature(-1);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-1, conditioner.getCurrentTemperature());
    }

    @Test
    void testDecreaseMinTemperature() {
        conditioner.setMinTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}