package com.bike.buildprocess;

import com.bike.bikecomponent.bikechair.Chair;
import com.bike.bikecomponent.bikechair.ComfortChair;
import com.bike.bikecomponent.bikechair.CruiserChair;
import com.bike.bikecomponent.bikechair.RacingChair;

import java.util.ArrayList;
import java.util.List;

public class ChairProcess extends GeneralProcess<Chair> {
    private Chair chair;

    @Override
    public void process() {
        if (generateList().size() != listOfChairs.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseChair.get());
        select(generateList());
    }
    @Override
    List<Chair> generateList() {
        final List<Chair> arrChair  = new ArrayList<>();
        arrChair.add(new ComfortChair());
        arrChair.add(new CruiserChair());
        arrChair.add(new RacingChair());

        return arrChair;
    }
    @Override
    public Chair getType() {
        if (chair == null) {
            throw new NullPointerException(printNoType.get());
        }
        return chair;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfChairs.length; i++) {
            System.out.println(i + ". " + listOfChairs[i].get());
        }
    }
    @Override
    void select(List<Chair> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Chair> typeList, int select) {
        this.chair = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfChairs[select].get() + printDash.get());
    }
}
