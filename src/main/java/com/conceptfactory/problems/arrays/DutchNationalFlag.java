package com.conceptfactory.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DutchNationalFlag {

    private enum Color { RED, WHITE, BLUE }

    public static void main(String[] args) {
        List<Color> test = new ArrayList<>();
        test.add(Color.RED);
        test.add(Color.WHITE);
        test.add(Color.WHITE);
        test.add(Color.RED);
        test.add(Color.BLUE);
        test.add(Color.BLUE);
        test.add(Color.WHITE);

        DutchNationalFlag d = new DutchNationalFlag();

        System.out.println(test.toString());

        List<Color> result = d.partition(test, 2);

        System.out.println(result.toString());
    }

    public List<Color> partition(List<Color> array, int partitionIndex) {
        Color pivot = array.get(partitionIndex);

        Color[] result = new Color[array.size()];
        Arrays.fill(result, Color.valueOf(pivot.name()));

        int head = 0;
        int tail = array.size() - 1;

        for (Color color : array) {
            if (color.ordinal() < pivot.ordinal()) {
                result[head++] = color;
            } else if (color.ordinal() > pivot.ordinal()) {
                result[tail--] = color;
            }
        }

        return Arrays.asList(result);
    }

}
