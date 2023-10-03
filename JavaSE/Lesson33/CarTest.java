package Lesson33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarTest {
    public static void filterCars(List<Car> cars, Predicate<Car> predicate,
                                   Consumer<Car> consumer) {
        for(Car car : cars) {
            if (predicate.test(car)) {
                consumer.accept(car);
            }
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(Car.Body.CUPE, 200);
        Car car2 = new Car(Car.Body.SEDAN, 150);
        Car car3 = new Car(Car.Body.HATCHBACK, 284);
        //создать еще 3 машины

        List<Car> carList = Arrays.asList(car1, car2, car3);
        //добавить их в список

        filterCars(carList, (car)->{return car.getPower() >= 200;}, (car)->{
            System.out.println(car);});

        //1-я лямбда - все машины с кузовом седан
        //2-я лямбда - все машины с хэтчбек и мощностью меньше 200
    }
}
