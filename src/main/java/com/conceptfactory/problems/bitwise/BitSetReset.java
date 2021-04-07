package com.conceptfactory.problems.bitwise;

public class BitSetReset {

    int setBit(int number, int bitToSet) {
        return number | (1 << bitToSet-1);
    }

    int resetBit(int number, int bitToSet) {
        return number & ~(1 << bitToSet-1);
    }
}
