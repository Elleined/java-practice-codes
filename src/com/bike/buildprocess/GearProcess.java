package com.bike.buildprocess;

import com.bike.bikecomponent.bikegear.FixedSpeedGear;
import com.bike.bikecomponent.bikegear.Gear;
import com.bike.bikecomponent.bikegear.HubGear;
import com.bike.bikecomponent.bikegear.SingleSpeedGear;

import java.util.ArrayList;
import java.util.List;

public class GearProcess extends GeneralProcess<Gear> {
    private Gear gear;

    @Override
    public void process() {
        if (generateList().size() != listOfGears.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseGear.get());
        select(generateList());
    }
    @Override
    List<Gear> generateList() {
        final List<Gear> arrGear  = new ArrayList<>();
        arrGear.add(new SingleSpeedGear());
        arrGear.add(new FixedSpeedGear());
        arrGear.add(new HubGear());

        return arrGear;
    }
    @Override
    public Gear getType() {
        if (gear == null) {
            throw new NullPointerException(printNoType.get());
        }
        return gear;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfGears.length; i++) {
            System.out.println(i + ". " + listOfGears[i].get());
        }
    }
    @Override
    void select(List<Gear> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Gear> typeList, int select) {
        this.gear = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfGears[select].get() + printDash.get());
    }
}
