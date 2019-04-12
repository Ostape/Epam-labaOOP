package com.robosh.service.factory;

import com.robosh.model.flowers.Flower;
import com.robosh.model.flowers.FlowerRose;
import com.robosh.model.flowers.FlowersColor;
import com.robosh.service.additionalService.RandomValues;

public class RoseCreate implements CreateFlower {
    @Override
    public Flower createFlower() {
        return new FlowerRose(FlowersColor.RED, RandomValues.rand(20,40),
                RandomValues.rand(0,100),20);
    }
}
