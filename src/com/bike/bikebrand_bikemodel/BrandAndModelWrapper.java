package com.bike.bikebrand_bikemodel;

public class BrandAndModelWrapper {
    private Brand brand;
    private Model model;

    public BrandAndModelWrapper() {
    }

    public static class Brand {
        protected Brand() {

        }
    }

    public static class Model {
        protected Model() {

        }
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }
}
