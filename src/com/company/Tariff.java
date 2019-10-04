package com.company;

abstract class Tariff {
    String name;
    Float annualCost;

    abstract Float calculateAnnualCost(Float yearlyConsumption);

    int comparison(Tariff tariff, Float consumption) {
        return this.calculateAnnualCost(consumption).compareTo(tariff.calculateAnnualCost(consumption));
    }
}

