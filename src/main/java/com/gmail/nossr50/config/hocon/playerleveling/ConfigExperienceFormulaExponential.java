package com.gmail.nossr50.config.hocon.playerleveling;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigExperienceFormulaExponential {

    private static final int BASE_DEFAULT = 2000;
    private static final double MULTIPLIER_DEFAULT = 0.1;
    private static final double EXPONENT_DEFAULT = 1.80;

    @Setting(value = "Base-Amount", comment = "" +
            "\nDefault value: "+BASE_DEFAULT)
    private int baseModifier = BASE_DEFAULT;

    @Setting(value = "Multiplier", comment = "" +
            "\nDefault value: "+MULTIPLIER_DEFAULT)
    private double multiplier = MULTIPLIER_DEFAULT;

    @Setting(value = "Exponent", comment = "" +
            "\nDefault value: "+EXPONENT_DEFAULT)
    private double exponent = EXPONENT_DEFAULT;

    public int getExponentialBaseModifier() {
        return baseModifier;
    }

    public double getExponentialMultiplier() {
        return multiplier;
    }

    public double getExponentialExponent() {
        return exponent;
    }
}