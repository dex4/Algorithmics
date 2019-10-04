package com.company;

public class PackagedTariff extends Tariff {
    private static final Long costPerUnit = 30L;
    private static final Long baseAnnualCost = 800L;
    private static final Long consumptionThreshold = 4000L;

    PackagedTariff() {
        name = "Packaged tariff";
    }

    @Override
    public Long calculateConsumption(Long yearlyConsumption) {
        if (yearlyConsumption <= consumptionThreshold) {
            return baseAnnualCost;
        } else {
            return baseAnnualCost + (yearlyConsumption - consumptionThreshold) * costPerUnit;
        }
    }

    @Override
    public int compareTo(Tariff tariff, long yearlyConsumption) {
        return Long.compare(this.calculateConsumption(yearlyConsumption),
                tariff.calculateConsumption(yearlyConsumption));
    }
}
