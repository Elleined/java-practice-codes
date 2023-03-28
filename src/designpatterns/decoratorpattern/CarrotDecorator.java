package designpatterns.decoratorpattern;

public class CarrotDecorator extends FoodDecorator {
    private final Food food;

    public CarrotDecorator(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return this.food.price() + 5;
    }
}
