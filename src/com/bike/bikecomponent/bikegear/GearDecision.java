package com.bike.bikecomponent.bikegear;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface GearDecision {
    // Predicate for tester
    Predicate<Gear> isHoldingChain = tire -> Gear.isStillIntactWithChain;
    // Consumer for setter
    Consumer<Boolean> setIsGearStillIntactWithChain = b -> Gear.isStillIntactWithChain = b;
    // Supplier for getter
    Supplier<Boolean> isHoldChain = () -> Gear.isStillIntactWithChain;
}
