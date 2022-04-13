package com.VariantsAction.Test;

public enum Season {

    SUMMER(28),AUTMN(5),SPRING(13),WINTER(-34);

    private int temperature;

    private Season(int temperature) {

        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }



}
