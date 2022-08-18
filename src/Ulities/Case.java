package Ulities;

import java.util.Arrays;
import java.util.List;

public class Case {
    private int min;
    private int max;
    private int norminal;

    public Case(int min, int max) {
        this.max = max;
        this.min = min;
        this.norminal = Math.round((max + min) / 2);
    }
    public List<Integer> getBVATestCase(){
        return Arrays.asList(min - 1, min , norminal, max - 1, max);
    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getNorminal() {
        return norminal;
    }
}
