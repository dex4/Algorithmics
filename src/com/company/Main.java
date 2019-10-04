package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<Float> yearlyConsumptions;

    public static void main(String[] args) {
        initYearlyConsumptions();
        listPairsBasedOnBestCost();
        listOrderedByCost();
    }

    private static void listPairsBasedOnBestCost() {
        System.out.println("List of tariffs paired by consumption and ordered based on annual cost:");
        System.out.println("Consumption\tTariff name\tAnnual cost");
        yearlyConsumptions.forEach(consumption -> {
            BasicTariff basicTariff = new BasicTariff(consumption);
            PackagedTariff packagedTariff = new PackagedTariff(consumption);
            if (basicTariff.compareTo(packagedTariff) <= 0) {
                System.out.println(basicTariff);
                System.out.println(packagedTariff);
            } else {
                System.out.println(packagedTariff);
                System.out.println(basicTariff);
            }
        });
        System.out.println();
    }

    private static void listOrderedByCost() {
        List<Tariff> tariffList = new ArrayList<>();
        yearlyConsumptions.forEach(consumption -> {
            tariffList.add(new BasicTariff(consumption));
            tariffList.add(new PackagedTariff(consumption));
        });
        Collections.sort(tariffList);
        System.out.println("List of tariffs ordered based on annual cost:");
        System.out.println("Consumption\tTariff name\tAnnual cost");
        tariffList.forEach(System.out::println);
        System.out.println();
    }

    private static void initYearlyConsumptions() {
        yearlyConsumptions = List.of(3500F, 3200F, 2500F, 4500F, 6000F);
    }
}
