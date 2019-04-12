package com.robosh.service.factory;

import com.robosh.model.flowers.Flower;
import com.robosh.model.flowers.FlowerSunflower;
import com.robosh.model.flowers.FlowersColor;
import com.robosh.service.additionalService.RandomValues;

public class SunflowerCreate implements CreateFlower {
    @Override
    public Flower createFlower() {
        return new FlowerSunflower(FlowersColor.YELLOW, RandomValues.rand(30, 60),
                RandomValues.rand(0,100),1000);
    }
}
