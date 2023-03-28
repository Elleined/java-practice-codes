package com.bike.buildprocess;

import com.bike.bikecomponent.bikeframe.AluminumFrame;
import com.bike.bikecomponent.bikeframe.CarbonFiberFrame;
import com.bike.bikecomponent.bikeframe.Frame;
import com.bike.bikecomponent.bikeframe.SteelFrame;

import java.util.ArrayList;
import java.util.List;

public class FrameProcess extends GeneralProcess<Frame> {
    private Frame frame;

    @Override
    public void process() {
        if (generateList().size() != listOfFrames.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseFrame.get());
        select(generateList());
    }
    @Override
    List<Frame> generateList() {
        final List<Frame> arrFrame  = new ArrayList<>();
        arrFrame.add(new SteelFrame());
        arrFrame.add(new CarbonFiberFrame());
        arrFrame.add(new AluminumFrame());

        return arrFrame;
    }
    @Override
    public Frame getType() {
        if (frame == null) {
            throw new NullPointerException(printNoType.get());
        }
        return frame;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfFrames.length; i++) {
            System.out.println(i + ". " + listOfFrames[i].get());
        }
    }
    @Override
    void select(List<Frame> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Frame> typeList, int select) {
        this.frame = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfFrames[select].get() + printDash.get());
    }
}
