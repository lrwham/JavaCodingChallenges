package org.lrwham.oddballs;

public enum RomanNumerals {
    I(1, 'I'),
    V(5, 'V'),
    X(10, 'X'),
    L(50, 'L'),
    C(100, 'C'),
    M(1000, 'M');

    public final int value;
    public final char label;

    RomanNumerals(int i, char label) {
        this.value = i;
        this.label = label;
    }
}
