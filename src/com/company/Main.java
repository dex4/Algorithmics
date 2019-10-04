package com.company;

import java.util.*;

public class Main {

    private static List<Float> yearlyConsumptions;

    public static void main(String[] args) {
        initYearlyConsumptions();
        listPairsBasedOnBestCost();
    }

    private static void listPairsBasedOnBestCost() {
        System.out.println("List of tariffs paired by consumption and ordered based on annual cost:");
        System.out.println("Consumption\tTariff name\tAnnual cost");
        yearlyConsumptions.forEach(consumption -> {
            BasicTariff basicTariff = new BasicTariff();
            PackagedTariff packagedTariff = new PackagedTariff();
            if (basicTariff.comparison(packagedTariff, consumption) <= 0) {
                System.out.println(consumption + "\t\t" + basicTariff);
                System.out.println(consumption + "\t\t" + packagedTariff);
            } else {
                System.out.println(consumption + "\t\t" + packagedTariff);
                System.out.println(consumption + "\t\t" + basicTariff);
            }
        });
        System.out.println();
    }

    private static void initYearlyConsumptions() {
        yearlyConsumptions = List.of(3500F, 3200F, 2500F, 4500F, 6000F);
    }
}
