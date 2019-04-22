package com.robosh.model.accessories;

public enum Accessories {
    PAPERWRAPPER(100),
    RIBBON(10), //lenta
    BASKET(250);

    private double costs;

    Accessories(double costs) {
        this.costs = costs;
    }

    public double getAccessoriesCosts() {
        return costs;
    }
}
