package com.robosh.model.flowers;

public class FlowerTulip extends Flower {

    private int numbersOfLeafs;

    public FlowerTulip(FlowersColor color, double lengthStem, double fleshness, int numbersOfLeafs) {
        super(color, lengthStem, fleshness);
        this.numbersOfLeafs = numbersOfLeafs;
    }

    public int getNumbersOfLeafs() {
        return numbersOfLeafs;
    }

    public void setNumbersOfLeafs(int numbersOfLeafs) {
        this.numbersOfLeafs = numbersOfLeafs;
    }

    @Override
    public String toString() {
        return "FlowerTulip{" +
                "numbersOfLeafs=" + numbersOfLeafs +
                ", color=" + color +
                ", lengthStem=" + lengthStem +
                ", freshness=" + freshness +
                '}';
    }
}
