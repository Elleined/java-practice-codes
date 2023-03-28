package com.bike.buildprocess;

import com.bike.bikecomponent.bikehandlebar.CruiserHandleBar;
import com.bike.bikecomponent.bikehandlebar.DropHandleBar;
import com.bike.bikecomponent.bikehandlebar.FlatHandleBar;
import com.bike.bikecomponent.bikehandlebar.HandleBar;

import java.util.ArrayList;
import java.util.List;

public class HandleBarProcess extends GeneralProcess<HandleBar> {
    private HandleBar handleBar;

    @Override
    public void process() {
        if (generateList().size() != listOfHandlebars.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseHandlebar.get());
        select(generateList());
    }
    @Override
    List<HandleBar> generateList() {
        final List<HandleBar> arrHandleBar  = new ArrayList<>();
        arrHandleBar.add(new FlatHandleBar());
        arrHandleBar.add(new DropHandleBar());
        arrHandleBar.add(new CruiserHandleBar());

        return arrHandleBar;
    }
    @Override
    public HandleBar getType() {
        if (handleBar == null) {
            throw new NullPointerException(printNoType.get());
        }
        return handleBar;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfHandlebars.length; i++) {
            System.out.println(i + ". " + listOfHandlebars[i].get());
        }
    }
    @Override
    void select(List<HandleBar> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<HandleBar> typeList, int select) {
        this.handleBar = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfHandlebars[select].get() + printDash.get());
    }
}
