package com.company;

abstract public class Tariff {
    public String name;
    public long annualCost;

    public abstract Long calculateConsumption(Long yearlyConsumption);
    public abstract int compareTo(Tariff tariff, long yearlyCost);
}

