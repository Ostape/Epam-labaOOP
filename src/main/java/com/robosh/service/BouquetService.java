package com.robosh.service;

import com.robosh.model.accessories.Accessories;
import com.robosh.model.bouquet.Bouquet;
import com.robosh.model.flowers.Flower;
import com.robosh.service.factory.*;

import java.util.List;

public class BouquetService {
    private static Bouquet bouquet = new Bouquet();

    public void addFlowers(String name, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException();
        }
        CreateFlower maker = createFlowerate(name);

        for (int i = 0; i < count; i++) {
            bouquet.setFlowers(maker.createFlower());
        }
    }

    private CreateFlower createFlowerate(String name) {
        switch (name) {
            case "rose":
                return new RoseCreate();

            case "tulip":
                return new TulipCreate();

            case "sunflower":
                return new SunflowerCreate();

            case "freesias":
                return new FreesiasCreate();

            default:
                throw new RuntimeException("No such flower in the shop");
        }
    }

    private void summarizingCostOfBouquet() {
        double sum = 0;
        if (flowersNotEmpty()) {
            for (Flower flower : bouquet.getFlowers()) {
                sum += flower.getFlowersPrice();
            }
            if (bouquet.getAccessories() != null) {
                sum += bouquet.getAccessories().getAccessoriesCosts();
            }
        }
        bouquet.setSumCosts(sum);
    }

    private boolean flowersNotEmpty() {
        return !bouquet.getFlowers().isEmpty();
    }

    public double getBouquetCosts() {
        summarizingCostOfBouquet();
        return bouquet.getSumCosts();
    }

    public void setBouquetAccessesories(Accessories accessesories) {
        bouquet.setAccessories(accessesories);
    }

    public List<Flower> getAllFlowers() {
        return bouquet.getFlowers();
    }

    public String showBouquet() {
        StringBuilder bouquetAppearance = new StringBuilder("Bouquet consist of\n");
        for (Flower flower : bouquet.getFlowers()) {
            bouquetAppearance.append(flower).append('\n');
        }
        if (bouquet.getAccessories() != null) {
            bouquetAppearance.append(bouquet.getAccessories()).append('\n');
        }
        return bouquetAppearance.toString();
    }

    void removeFlowers() {
        bouquet.getFlowers().clear();
    }
}
