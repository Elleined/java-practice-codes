package com.bike.bikecomponent.bikepedal;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface PedalDecision {
    // Predicate for tester
    Predicate<Pedal> isPedalRollingGear = pedal -> Pedal.isStillRollingTheGear;
    // Consumer for setter
    Consumer<Boolean> setIsPedalStillRollingTheGear = b -> Pedal.isStillRollingTheGear = b;
    // Supplier for getter
    Supplier<Boolean> isPedalRollGear = () -> Pedal.isStillRollingTheGear;

}
