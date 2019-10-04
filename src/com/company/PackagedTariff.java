package com.company;

public class PackagedTariff extends Tariff {
    private static final Float costPerUnit = 0.30F;
    private static final Float baseAnnualCost = 800F;
    private static final Long consumptionThreshold = 4000L;

    PackagedTariff() {
        name = "Packaged";
    }

    @Override
    public Float getAnnualCost(Float yearlyConsumption) {
        if (yearlyConsumption <= consumptionThreshold) {
            return baseAnnualCost;
        } else {
            return baseAnnualCost + (yearlyConsumption - consumptionThreshold) * costPerUnit;
        }
    }

    @Override
    public int compareTo(Tariff tariff, Float yearlyConsumption) {
        return Float.compare(this.getAnnualCost(yearlyConsumption),
                tariff.getAnnualCost(yearlyConsumption));
    }
}
