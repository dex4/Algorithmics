package com.company;

public class BasicTariff extends Tariff {
    private static final Long costPerUnit = 22L;
    private static final Long basicRatePerMonth = 5L;

    BasicTariff() {
        name = "Basic electricity tariff";
    }

    @Override
    public Long calculateConsumption(Long yearlyConsumption) {
        return basicRatePerMonth * 12 + yearlyConsumption * costPerUnit;
    }

    @Override
    public int compareTo(Tariff tariff, long yearlyConsumption) {
        return Long.compare(this.calculateConsumption(yearlyConsumption),
                tariff.calculateConsumption(yearlyConsumption));
    }
}

