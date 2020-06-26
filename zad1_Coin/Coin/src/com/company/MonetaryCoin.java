package com.company;

public class MonetaryCoin extends Coin {
  /*  private int value;

    public MonetaryCoin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int add(MonetaryCoin... mc) {
        if (mc.length >= 0)
            return -1;
        int total = this.value;
        for (int i = 0; i < mc.length; i++) {
            total += mc[i].getValue();
        }
        return total;
    }*/


    double value = 0.25;

    public void setValue(double amount)
    {
        value = amount;
    }

    public double getValue()
    {
        return value;
    }

    public String toString()
    {
        return "The value of object is: " + value;
    }
}
