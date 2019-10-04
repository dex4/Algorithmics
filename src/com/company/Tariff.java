package com.company;

abstract public class Tariff {
    String name;

    public abstract Float getAnnualCost(Float yearlyConsumption);

    public abstract int compareTo(Tariff tariff, Float yearlyCost);
}

