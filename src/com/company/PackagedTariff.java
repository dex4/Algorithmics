package com.company;

public class PackagedTariff extends Tariff {
    private static final Float costPerUnit = 0.30F;
    private static final Float baseAnnualCost = 800F;
    private static final Long consumptionThreshold = 4000L;

    PackagedTariff(Float consumption) {
        super(consumption);
        name = "Packaged";
    }

    @Override
    public Float calculateAnnualCost(Float yearlyConsumption) {
        if (yearlyConsumption <= consumptionThreshold) {
            return baseAnnualCost;
        } else {
            return baseAnnualCost + (yearlyConsumption - consumptionThreshold) * costPerUnit;
        }
    }

    @Override
    public String toString() {
        return consumption + "\t\t" + name + "\t" + annualCost;
    }
}
