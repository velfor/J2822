package Lesson32;

import java.util.Objects;

public class HeavyBox implements Comparable<HeavyBox> {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavyBox)) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return getWeight() == heavyBox.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }

    @Override
    public int compareTo(HeavyBox o) {
        if (weight == o.getWeight()) return 0;
        else if (weight > o.getWeight()) return 1;
        else return -1;
    }


}
