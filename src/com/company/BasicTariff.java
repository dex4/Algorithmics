package com.company;

public class BasicTariff extends Tariff {
    private static final Float costPerUnit = 0.22F;
    private static final Long basicRatePerMonth = 5L;

    BasicTariff() {
        this.name = "Basic";
    }

    @Override
    public Float getAnnualCost(Float yearlyConsumption) {
        return basicRatePerMonth * 12 + yearlyConsumption * costPerUnit;
    }

    @Override
    public int compareTo(Tariff tariff, Float yearlyConsumption) {
        return Float.compare(this.getAnnualCost(yearlyConsumption),
                tariff.getAnnualCost(yearlyConsumption));
    }
}

