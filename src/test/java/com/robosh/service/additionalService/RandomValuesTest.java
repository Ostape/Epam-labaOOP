package com.robosh.service.additionalService;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RandomValuesTest {

    @Test
    public void shouldReturnRandomValue() {
        assertEquals(10, RandomValues.rand(10, 11), 1);
    }

    @Test
    public void shouldNotReturnOutOfRangeValue() {
        assertNotEquals(9, RandomValues.rand(10, 12));
    }
}
