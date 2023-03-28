package com.bike.bikecomponent.bikechain;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface ChainDecision {
    // Predicate for tester
    Predicate<Chain> isHoldingGear = chain -> Chain.isHoldingGear;
    // Consumer for setter
    Consumer<Boolean> setChainIsHoldingGear = b -> Chain.isHoldingGear = b;
    // Supplier for getter
    Supplier<Boolean> isChainHoldGear = () -> Chain.isHoldingGear;
}
