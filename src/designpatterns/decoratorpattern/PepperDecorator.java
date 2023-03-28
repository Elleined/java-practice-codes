package designpatterns.decoratorpattern;

public class PepperDecorator extends FoodDecorator {
    private final Food food;

    public PepperDecorator(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return this.food.price() + 10;
    }
}
