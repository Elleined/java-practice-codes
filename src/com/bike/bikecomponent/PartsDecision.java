package com.bike.bikecomponent;

import com.bike.bikecomponent.bikechain.Chain;
import com.bike.bikecomponent.bikechain.ChainDecision;
import com.bike.bikecomponent.bikegear.Gear;
import com.bike.bikecomponent.bikegear.GearDecision;
import com.bike.bikecomponent.bikepedal.Pedal;
import com.bike.bikecomponent.bikepedal.PedalDecision;
import com.bike.bikecomponent.biketire.Tire;
import com.bike.bikecomponent.biketire.TireDecision;

interface PartsDecision
        extends TireDecision,
        ChainDecision,
        GearDecision,
        PedalDecision {

    static void tireLogic(Tire tire){
        boolean tireLogic = isRollingTire.test(tire);
        if (tireLogic){
            setIsTireStillRolling.accept(true);
        } else {
            setIsTireStillRolling.accept(false);
        }
        System.out.println("Tire is rolling?: " + isTireRolling.get());
    }

    static void chainLogic(Chain chain){
        boolean chainLogic = isHoldingGear.test(chain) && isTireRolling.get();
        if (chainLogic){
            setChainIsHoldingGear.accept(true);
            setIsTireStillRolling.accept(true);
        } else {
            setChainIsHoldingGear.accept(false);
            setIsTireStillRolling.accept(false);
        }
        System.out.println("Chain is holding the gear? " + isChainHoldGear.get());
    }

    static void gearLogic(Gear gear){
        boolean gearLogic  =  isHoldingChain.test(gear) &&
                                    isChainHoldGear.get() &&
                                    isTireRolling.get();
        if (gearLogic) {
            setIsGearStillIntactWithChain.accept(true);
            setChainIsHoldingGear.accept(true);
            setIsTireStillRolling.accept(true);
        } else {
            setIsGearStillIntactWithChain.accept(false);
            setChainIsHoldingGear.accept(false);
            setIsTireStillRolling.accept(false);
        }
        System.out.println("Gear is still intact with chain? " +  isHoldChain.get());
    }

    static void pedalLogic(Pedal pedal) {
        boolean pedalLogic =  isPedalRollingGear.test(pedal) &&
                                    isHoldChain.get() &&
                                    isChainHoldGear.get() &&
                                    isTireRolling.get();
        if (pedalLogic) {
            setIsPedalStillRollingTheGear.accept(true);
            setIsGearStillIntactWithChain.accept(true);
            setChainIsHoldingGear.accept(true);
            setIsTireStillRolling.accept(true);
        } else {
            setIsPedalStillRollingTheGear.accept(false);
            setIsGearStillIntactWithChain.accept(false);
            setChainIsHoldingGear.accept(false);
            setIsTireStillRolling.accept(false);
        }
        System.out.println("Pedal rolling the gear? " + isPedalRollGear.get());
    }
}
