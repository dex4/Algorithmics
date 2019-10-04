package com.company;

class BasicTariff extends Tariff {
    private static final Float costPerUnit = 0.22F;
    private static final Long basicRatePerMonth = 5L;

    BasicTariff() {
        name = "Basic";
    }

    @Override
    Float calculateAnnualCost(Float yearlyConsumption) {
        this.annualCost = basicRatePerMonth * 12 + yearlyConsumption * costPerUnit;
        return annualCost;
    }

    @Override
    public String toString() {
        return name + "\t\t" + annualCost;
    }
}

