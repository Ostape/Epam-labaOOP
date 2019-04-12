package com.robosh;


import com.robosh.model.accessories.Accessories;
import com.robosh.model.flowers.Flower;
import com.robosh.service.BouquetService;
import com.robosh.service.additionalService.Input;
import com.robosh.service.comporator.FreshnessComporator;

public class MainInterface {

    private Accessories accessories;
    private BouquetService bouquetService = new BouquetService();

    public static void main(String[] args) {
        System.out.println("\t\tHello, it is the Flowers` shop Kvitochka");
        new MainInterface().control();
    }

    private void mainMenu(){
        System.out.println("Now you can choose the action");
        System.out.println("1. Make an order");
        System.out.println("2. Show a bouquet and its price");
        System.out.println("3. Sort flowers with their freshness");
        System.out.println("4. Find a flower corresponding to a given range of length of stems(cm)");
        System.out.println("5. Go to exit from this beautiful shop");
        System.out.println("Please choose a number of action");
    }

    private void secondMenu(){
        System.out.println("1. Add flowers");
        System.out.println("2. Add accessories");
        System.out.println("3. Return to main menu");
        System.out.println("Please choose a number of action");
    }

    private void control(){
        int numberAction;
        do {
            mainMenu();
            numberAction = Input.checkIntegerValue();
        }while (action(numberAction));
    }


    private boolean action(int numberAction){
        switch (numberAction){
            case 1:
                screenLine();
                secondMenu();
                makingOrder();
                screenLine();
                break;

            case 2:
                screenLine();
                showBouquetAndPrice();
                screenLine();
                break;

            case 3:
                screenLine();
                showSortedFlowers();
                screenLine();
                break;

            case 4:
                screenLine();
                showGivenRangeLengthStems();
                screenLine();
                break;

            case 5:
                return false;

            default:
                System.out.println("No such action, please try one more");
        }
        return true;
    }

    private void makingOrder(){
        boolean flag = true;
        do {
            int secondAction = Input.checkIntegerValue();
            switch (secondAction){
                case 1:
                    createBouquet();
                    flag = false;
                    break;

                case 2:
                    System.out.println("Enter the accessory: ");
                    getAccessories();
                    bouquetService.setBouquetAccessesories(accessories);
                    flag = false;
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("No such action, please try one more");
                    break;
            }
        }while (flag);
    }

    private void createBouquet() {
        System.out.println("Please make your order: ");
        System.out.println("Enter what flower you want to buy: ");
        String nameFlower = Input.inputString();
        System.out.println("Enter the count of flowers: ");
        int count = Input.checkIntegerValue();
        bouquetService.addFlowers(nameFlower, count);
        System.out.println("The bouquet created!");
    }

    private static void screenLine() {
        System.out.println();
        for (int i = 0; i < 25; ++i) System.out.print("*");
        System.out.println();
    }

    private void getAccessories(){
        do {
            try {
                accessories =  Accessories.valueOf(Input.inputString().toUpperCase());
                break;
            } catch(IllegalArgumentException e) {
                System.out.println("No such accessory in the shop!");
                e.getMessage();
            }
        }
        while (true);
    }

    private void showBouquetAndPrice(){
        bouquetService.showBouquet();
        System.out.println("and it`s price is: " + bouquetService.getBouquetCosts());
    }

    private void showGivenRangeLengthStems(){
        System.out.println("Input the range you`d like to find");
        System.out.println("Enter 'from': ");
        double from = Input.checkDoubleValue();
        System.out.println("Enter 'to': ");
        double to = Input.checkDoubleValue();

        for (Flower flower : bouquetService.getAllFlowers()){
            if (flower.getLengthStem() >= from && flower.getLengthStem() <= to){
                System.out.println(flower);
            }
        }
    }

    private void showSortedFlowers(){
        bouquetService.getAllFlowers().sort(new FreshnessComporator());
        bouquetService.getAllFlowers().forEach(System.out::println);
    }

}