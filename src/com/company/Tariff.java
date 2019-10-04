package com.company;

abstract class Tariff implements Comparable<Tariff> {
    String name;
    Float annualCost;
    Float consumption;

    Tariff(Float consumption) {
        this.consumption = consumption;
        annualCost = calculateAnnualCost(consumption);
    }

    abstract Float calculateAnnualCost(Float yearlyConsumption);

    @Override
    public int compareTo(Tariff tariff) {
        return Float.compare(this.annualCost, tariff.annualCost);
    }
}

