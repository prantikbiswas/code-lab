package com.conceptfactory.problems.arrays;

public class DeleteDuplicatesFromSortedArray {

    public int dedupe(int[] source) {
        if (source.length == 0) { return 0; }

        int lastElementPointer = 0;
        for(int i = 1; i < source.length; i++) {
            if (source[i] != source[lastElementPointer]) {
                source[++lastElementPointer] = source[i];
            }
        }

        return lastElementPointer + 1;
    }

}
