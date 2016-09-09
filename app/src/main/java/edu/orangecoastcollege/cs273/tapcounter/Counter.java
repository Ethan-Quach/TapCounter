package edu.orangecoastcollege.cs273.tapcounter;

public class Counter {
    private int mCount;
    public Counter() {
        mCount = 0;
    }

    public int getCount() {
        return mCount;
    }

    public void increment() {
        this.mCount++;
    }
}