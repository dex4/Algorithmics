package com.company;

import java.util.List;

public class Main {

    private static List<Float> yearlyConsumptions;

    public static void main(String[] args) {
        initYearlyConsumptions();
        System.out.println("Consumption\tTariff name\tAnnual cost");
        yearlyConsumptions.forEach(Main::listBasedOnBestCost);
    }

    private static void initYearlyConsumptions() {
        yearlyConsumptions = List.of(3500F, 4500F, 6000F);
    }

    private static void listBasedOnBestCost(Float consumption) {
        BasicTariff basicTariff = new BasicTariff();
        PackagedTariff packagedTariff = new PackagedTariff();
        if (basicTariff.compareTo(packagedTariff, consumption) <= 0) {
            System.out.println(consumption + "\t\t" + basicTariff.name + "\t\t" + basicTariff.getAnnualCost(consumption));
            System.out.println(consumption + "\t\t" + packagedTariff.name + "\t" + packagedTariff.getAnnualCost(consumption));
        } else {
            System.out.println(consumption + "\t\t" + packagedTariff.name + "\t" + packagedTariff.getAnnualCost(consumption));
            System.out.println(consumption + "\t\t" + basicTariff.name + "\t\t" + basicTariff.getAnnualCost(consumption));
        }
    }
}
