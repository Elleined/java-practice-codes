package com.bike.mainbike;
import com.bike.bikebrand_bikemodel.BrandAndModelWrapper.*;
import com.bike.bikebrand_bikemodel.BrandAndModelWrapper;
import com.bike.bikecomponent.Parts;

public class Bike implements BikeDoing {
    static boolean isUserPedalling;

    public Bike() {

    }

    public Bike(BikeBuilder builder) {
        // bike logic here...

    }

    public Bike build() {
        BrandAndModelWrapper brandAndModel = new BrandAndModelWrapper();
        Parts parts = new Parts();
        BikeBuilder bikeBuilder = new BikeBuilder(brandAndModel, parts);
        return new Bike(bikeBuilder);
    }

    @Override
    public void accelerate() {
    }
    @Override
    public void stop() {

    }
    @Override
    public void brake() {

    }
    @Override
    public void run() {

    }
    @Override
    public void horn() {

    }
    @Override
    public void signalLight() {

    }
}
