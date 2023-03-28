package com.bike.buildprocess;
import com.bike.bikebrand_bikemodel.BrandAndModelWrapper.Brand;
import com.bike.bikebrand_bikemodel.bikebrand.Avon;
import com.bike.bikebrand_bikemodel.bikebrand.BMW;
import com.bike.bikebrand_bikemodel.bikebrand.Topstar;

import java.util.ArrayList;
import java.util.List;

public final class BrandProcess extends GeneralProcess<Brand> {
    private Brand brand;

    @Override
    public void process() {
        if (generateList().size() != listOfBrands.length) {
            throw new RuntimeException(printUpdateBoth.get());
        }
        displayList();
        System.out.print(printChooseBrand.get());
        select(generateList());
    }
    @Override
    List<Brand> generateList() {
        final List<Brand> arrBrand = new ArrayList<>();
        arrBrand.add(new BMW());
        arrBrand.add(new Topstar());
        arrBrand.add(new Avon());

        return arrBrand;
    }
    @Override
    public Brand getType() {
        if (brand == null) {
            throw new NullPointerException(printNoType.get());
        }
        return brand;
    }
    @Override
    void displayList() {
        for (int i = 0; i < listOfBrands.length; i++) {
            System.out.println(i + ". " + listOfBrands[i].get());
        }
    }
    @Override
    void select(List<Brand> typeList) {
        super.select(typeList);
    }
    @Override
    void getCurrentType(List<Brand> typeList, int select) {
        this.brand = typeList.get(select);
    }
    @Override
    void getSelected(int select) {
        System.out.println(printDash.get() + listOfBrands[select].get() + printDash.get());
    }
}
