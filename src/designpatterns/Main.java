package designpatterns;
import designpatterns.decoratorpattern.*;

public class Main {
    public static void main(String[] args) {
        FoodDecorator decorator = new CarrotDecorator(new CarrotDecorator(new PepperDecorator(new ChineseFood())));
        System.out.println(decorator.price());
    }
}
