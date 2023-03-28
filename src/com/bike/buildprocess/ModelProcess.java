package com.bike.buildprocess;

import com.bike.bikebrand_bikemodel.BrandAndModelWrapper.Model;
import com.bike.bikebrand_bikemodel.bikemodel.FoldingBike;
import com.bike.bikebrand_bikemodel.bikemodel.MountainBike;
import com.bike.bikebrand_bikemodel.bikemodel.RoadBike;

import java.util.ArrayList;
import java.util.List;

public class ModelProcess extends GeneralProcess<Model> {
    private Model model;

    @Override
    public void process() {
        if (generateList().size() != listOfModels.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseModel.get());
        select(generateList());
    }
    @Override
    List<Model> generateList() {
        List<Model> modelList = new ArrayList<>();
        modelList.add(new FoldingBike());
        modelList.add(new MountainBike());
        modelList.add(new RoadBike());

        return modelList;
    }
    @Override
    public Model getType() {
        if (model == null) {
            throw new NullPointerException(printNoType.get());
        }
        return model;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfModels.length; i++) {
            System.out.println(i + ". " + listOfModels[i].get());
        }
    }
    @Override
    void select(List<Model> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Model> typeList, int select) {
        this.model = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfModels[select].get() + printDash.get());
    }
}
