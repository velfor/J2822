package Lesson24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        //без дженериков
        List listAnimal = new ArrayList();
        listAnimal.add("Cat");
        listAnimal.add("Dog");
        listAnimal.add("Horse");
        String firstAnimal = (String)listAnimal.get(0);
        System.out.println(firstAnimal);
        //с дженериком
        List<String> listAnimal1 = new ArrayList<>();
        listAnimal1.add("Cat1");
        listAnimal1.add("Dog1");
        listAnimal1.add("Horse1");
        String firstAnimal1 = listAnimal1.get(0);
        System.out.println(firstAnimal1);*/
        Mage mage = new Mage();
        mage.cast();
        mage.hit();
        mage.move();
    }

}
//ходить
interface canMove{
    void move();
}
//летать
//бить
interface canHit{
    void hit();
}
//стрелять
//колдовать
interface canCast{
    void cast();
}
//Маг - ходить, бить, колдовать
class Mage implements canMove, canHit, canCast{
    @Override
    public void cast() {
        System.out.println("Mage casting");
    }

    @Override
    public void move() {
        System.out.println("Mage moving");
    }

    @Override
    public void hit() {
        System.out.println("Mage hiting");
    }
}