package com.robosh.service.factory;

import com.robosh.model.flowers.Flower;
import com.robosh.model.flowers.FlowerTulip;
import com.robosh.model.flowers.FlowersColor;
import com.robosh.service.additionalService.RandomValues;

public class TulipCreate implements CreateFlower {
    @Override
    public Flower createFlower() {
        return new FlowerTulip(FlowersColor.WHITE, RandomValues.rand(12,30),
                RandomValues.rand(0,100), 5);
    }
}
