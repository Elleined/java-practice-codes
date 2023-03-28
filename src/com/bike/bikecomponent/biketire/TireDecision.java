package com.bike.bikecomponent.biketire;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public interface TireDecision {
    // Predicate for tester
    Predicate<Tire> isRollingTire = tire ->  Tire.isStillRolling;
    // Consumer for setter
    Consumer<Boolean> setIsTireStillRolling = b -> Tire.isStillRolling = b;
    // Supplier for getter
    Supplier<Boolean> isTireRolling = () -> Tire.isStillRolling;
}
