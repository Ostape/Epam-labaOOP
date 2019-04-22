package com.robosh.service.comporator;


import com.robosh.model.flowers.Flower;

import java.util.Comparator;


public class FreshnessComporator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return Double.compare(o1.getFreshness(), o2.getFreshness());
    }
}
