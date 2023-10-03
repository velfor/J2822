package Lesson43;

import java.util.ArrayList;
import java.util.List;

/*
Создайте класс Автомобиля. Он должен хранить информацию о названии автомобиля, год выпуска, цена,
цвет, объем двигателя. Нужно создать набор автомобилей и выполнить следующие задачи:
■ Показать все автомобили;
■ Показать все автомобили заданного цвета;
■ Показать все автомобили заданного объёма;
■ Показать все автомобили дороже заданной цены;
■ Показать все автомобили чей год выпуска находится в указанном диапазоне.
 */
class Auto{
    private String marka;
    private int yearOfProd;
    private int price;
    private String color;
    private int volume;



    public String getMarka() {
        return marka;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
    public Auto(String marka, int yearOfProd, int price, String color, int volume) {
        this.marka = marka;
        this.yearOfProd = yearOfProd;
        this.price = price;
        this.color = color;
        this.volume = volume;
    }
}
public class Task3 {
    public static void main(String[] args) {
        List<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Lada Kalina", 2010, 4000, "White", 1600));
        autoList.add(new Auto("BMW X3", 208, 6500, "Black", 3200));
        autoList.add(new Auto("Hundai Accent", 2012, 5200, "Red", 1400));
        autoList.add(new Auto("KIA Sportage", 2016, 25000, "White", 2200));
        autoList.add(new Auto("Hundai Santa Fe", 2018, 20000, "Red", 2200));


    }
}
