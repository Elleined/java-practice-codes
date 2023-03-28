package com.bike.buildprocess;

import com.bike.Printable;
import com.bike.bikecomponent.bikechain.Chain;
import com.bike.bikecomponent.bikechain.DoubleStrandChain;
import com.bike.bikecomponent.bikechain.SingleStrandChain;
import com.bike.bikecomponent.bikechain.TripleStrandChain;

import java.util.ArrayList;
import java.util.List;

public final class ChainProcess extends GeneralProcess<Chain> {
    private Chain chain;

    @Override
    public void process() {
        if (generateList().size() != listOfChains.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseChain.get());
        select(generateList());
    }
    @Override
    List<Chain> generateList() {
        final List<Chain> arrChain = new ArrayList<>();
        arrChain.add(new SingleStrandChain());
        arrChain.add(new DoubleStrandChain());
        arrChain.add(new TripleStrandChain());

        return arrChain;
    }
    @Override
    public Chain getType() {
        if (chain == null) {
            throw new NullPointerException(Printable.printNoType.get());
        }
        return chain;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfChains.length; i++) {
            System.out.println(i + ". " + listOfChains[i].get());
        }
    }
    @Override
    void select(List<Chain> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Chain> typeList, int select) {
        this.chain = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfChains[select].get() + printDash.get());
    }
}
