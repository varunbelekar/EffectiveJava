package com.varun.annotations;

@SmartPhone(osName = "Android", version = 2)
public class Nokia {
    private String model;
    private int screenSize;

    public Nokia(String model, int screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
