package com.company;

public class PackagedTariff extends Tariff {
    private static final Float costPerUnit = 0.30F;
    private static final Float baseAnnualCost = 800F;
    private static final Long consumptionThreshold = 4000L;

    PackagedTariff() {
        name = "Packaged";
    }

    @Override
    public Float calculateAnnualCost(Float yearlyConsumption) {
        if (yearlyConsumption <= consumptionThreshold) {
            this.annualCost = baseAnnualCost;
        } else {
            this.annualCost = baseAnnualCost + (yearlyConsumption - consumptionThreshold) * costPerUnit;
        }
        return annualCost;
    }

    @Override
    public String toString() {
        return name + "\t" + annualCost;
    }
}
