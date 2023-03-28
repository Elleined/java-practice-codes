package com.bike.buildprocess;

import com.bike.bikecomponent.bikepedal.ClipLessPedal;
import com.bike.bikecomponent.bikepedal.ClipPedal;
import com.bike.bikecomponent.bikepedal.Pedal;
import com.bike.bikecomponent.bikepedal.PlatformPedal;

import java.util.ArrayList;
import java.util.List;

public class PedalProcess extends GeneralProcess<Pedal> {
    private Pedal pedal;

    @Override
    public void process() {
        if (generateList().size() != listOfPedals.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChoosePedal.get());
        select(generateList());
    }
    @Override
    List<Pedal> generateList() {
        final List<Pedal> arrPedal  = new ArrayList<>();
        arrPedal.add(new ClipPedal());
        arrPedal.add(new PlatformPedal());
        arrPedal.add(new ClipLessPedal());

        return arrPedal;
    }
    @Override
    public Pedal getType() {
        if (pedal == null) {
            throw new NullPointerException(printNoType.get());
        }
        return pedal;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfPedals.length; i++) {
            System.out.println(i + ". " + listOfPedals[i].get());
        }
    }
    @Override
    void select(List<Pedal> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Pedal> typeList, int select) {
        this.pedal = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfPedals[select].get() + printDash.get());
    }
}
