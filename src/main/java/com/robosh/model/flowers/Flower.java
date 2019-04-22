package com.robosh.model.flowers;


import java.util.Objects;

public abstract class Flower {

    protected FlowersColor color;
    protected double lengthStem;
    protected double freshness;
    protected double flowersPrice;

    public Flower(FlowersColor color, double lengthStem, double fleshness, double flowersPrice) {
        this.lengthStem = lengthStem;
        this.color = color;
        this.freshness = fleshness;
        this.flowersPrice = flowersPrice;
    }

    public double getFlowersPrice() {
        return flowersPrice;
    }

    public void setFlowersPrice(double flowersPrice) {
        this.flowersPrice = flowersPrice;
    }

    public double getFreshness() {
        return freshness;
    }

    public void setFreshness(double freshness) {
        this.freshness = freshness;
    }

    public FlowersColor getColor() {
        return color;
    }

    public void setColor(FlowersColor color) {
        this.color = color;
    }

    public double getLengthStem() {
        return lengthStem;
    }

    public void setLengthStem(double lengthStem) {
        this.lengthStem = lengthStem;
    }


}
