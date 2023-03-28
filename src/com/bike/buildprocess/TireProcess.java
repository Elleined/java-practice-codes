package com.bike.buildprocess;

import com.bike.bikecomponent.biketire.CommuterTire;
import com.bike.bikecomponent.biketire.MountainTire;
import com.bike.bikecomponent.biketire.RoadTire;
import com.bike.bikecomponent.biketire.Tire;

import java.util.ArrayList;
import java.util.List;

public class TireProcess extends GeneralProcess<Tire> {
    private Tire tire;

    @Override
    public void process() {
        if (generateList().size() != listOfTires.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseTire.get());
        select(generateList());
    }
    @Override
    List<Tire> generateList() {
        final List<Tire> arrTire  = new ArrayList<>();
        arrTire.add(new RoadTire());
        arrTire.add(new MountainTire());
        arrTire.add(new CommuterTire());

        return arrTire;
    }
    @Override
    public Tire getType() {
        if (tire == null) {
            throw new NullPointerException(printNoType.get());
        }
        return tire;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfTires.length; i++) {
            System.out.println(i + ". " + listOfTires[i].get());
        }
    }
    @Override
    void select(List<Tire> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Tire> typeList, int select) {
        this.tire = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfTires[select].get() + printDash.get());
    }
}
