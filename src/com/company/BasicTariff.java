package com.company;

class BasicTariff extends Tariff {
    private static final Float costPerUnit = 0.22F;
    private static final Long basicRatePerMonth = 5L;

    BasicTariff(Float consumption) {
        super(consumption);
        name = "Basic";
    }

    @Override
    Float calculateAnnualCost(Float yearlyConsumption) {
        return basicRatePerMonth * 12 + yearlyConsumption * costPerUnit;
    }

    @Override
    public String toString() {
        return consumption + "\t\t" + name + "\t\t" + annualCost;
    }
}

