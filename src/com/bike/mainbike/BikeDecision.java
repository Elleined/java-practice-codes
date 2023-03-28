package com.bike.mainbike;

import com.bike.bikecomponent.bikepedal.Pedal;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface BikeDecision {
    // Predicate for tester
    Predicate<Pedal> isUserPedallingTester = pedal -> Bike.isUserPedalling;
    // Consumer for setter
    Consumer<Boolean> setIsPedalUserPedalling = b -> Bike.isUserPedalling = b;
    // Supplier for getter
    Supplier<Boolean> getIsPedalUserPedalling = () -> Bike.isUserPedalling;
}
