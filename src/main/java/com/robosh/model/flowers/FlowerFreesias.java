package com.robosh.model.flowers;

public class FlowerFreesias extends Flower {
    public FlowerFreesias(FlowersColor color, double lengthStem, double fleshness) {
        super(color, lengthStem, fleshness);
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
