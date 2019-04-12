package com.robosh.model.flowers;

public class FlowerSunflower extends Flower {

    private int seeds;

    public FlowerSunflower(FlowersColor color, double lengthStem, double fleshness,double flowersPrice, int seeds) {
        super(color, lengthStem, fleshness, flowersPrice);
        this.seeds = seeds;
    }

    public int getSeeds() {
        return seeds;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }

    @Override
    public String toString() {
        return "FlowerSunflower{" +
                "seeds=" + seeds +
                ", color=" + color +
                ", lengthStem=" + lengthStem +
                ", freshness=" + freshness +
                '}';
    }
}
