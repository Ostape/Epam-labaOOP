package com.robosh.model.flowers;

public class FlowerRose extends Flower {
    private int numberOfNeedles;

    public FlowerRose(FlowersColor color, double lengthStem, double fleshness,double flowersPrice, int numberOfNeedles) {
        super(color, lengthStem, fleshness,flowersPrice);
        this.numberOfNeedles = numberOfNeedles;
    }

    public int getNumberOfNeedles() {
        return numberOfNeedles;
    }

    public void setNumberOfNeedles(int numberOfNeedles) {
        this.numberOfNeedles = numberOfNeedles;
    }

    @Override
    public String toString() {
        return "FlowerRose{" +
                "numberOfNeedles=" + numberOfNeedles +
                ", color=" + color +
                ", lengthStem=" + lengthStem +
                ", freshness=" + freshness +
                '}';
    }
}
