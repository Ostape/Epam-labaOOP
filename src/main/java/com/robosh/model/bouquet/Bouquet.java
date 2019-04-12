package com.robosh.model.bouquet;

import com.robosh.model.accessories.Accessories;
import com.robosh.model.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private Accessories accessories;
    private double sumCosts;

    public double getSumCosts() {
        return sumCosts;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public void setFlowers(Flower flowers) {
        this.flowers.add(flowers);
    }

    public void setSumCosts(double sumCosts) {
        this.sumCosts = sumCosts;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

}
