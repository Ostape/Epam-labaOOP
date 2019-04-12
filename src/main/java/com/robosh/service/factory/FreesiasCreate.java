package com.robosh.service.factory;

import com.robosh.model.flowers.Flower;
import com.robosh.model.flowers.FlowerFreesias;
import com.robosh.model.flowers.FlowersColor;
import com.robosh.service.additionalService.RandomValues;

public class FreesiasCreate implements CreateFlower {
    @Override
    public Flower createFlower() {
        return new FlowerFreesias(FlowersColor.BLUE, RandomValues.rand(12, 20),
                RandomValues.rand(0,100));
    }
}
