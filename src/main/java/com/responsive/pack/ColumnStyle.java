package com.responsive.pack;

public enum ColumnStyle {
    FULL(1),
    HALF(2),
    ONETHIRD(3),
    TWOTHIRDS(4),
    ONEQUARTER(5);

    private int value;

    ColumnStyle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
