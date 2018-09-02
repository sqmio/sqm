package io.sqm.app.entity;

public enum Currency {
    RUR(10),
    USD(20),
    EUR(30);
    private int code;

    Currency(int code) {
        this.code = code;
    }

    public static Currency find(int code) {
        for (Currency value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }

    public int getCurrency() {
        return code;
    }
}
