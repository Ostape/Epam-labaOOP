package com.robosh.service.additionalService;

import java.util.Random;

public class RandomValues {
    public static double rand(double rangeMin, double rangeMax) {
        Random random = new Random();
        return rangeMin + (rangeMax - rangeMin) * random.nextDouble();
    }
}
