package com.robosh.model.flowers;

public class FlowerFreesias extends Flower {
    public FlowerFreesias(FlowersColor color, double lengthStem, double fleshness, double flowersPrice) {
        super(color, lengthStem, fleshness, flowersPrice);
    }

    @Override
    public String toString() {
        return "FlowerFreesias{" +
                "color=" + color +
                ", lengthStem=" + lengthStem +
                ", freshness=" + freshness +
                '}';
    }
}
