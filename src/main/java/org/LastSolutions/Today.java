package org.LastSolutions;

public class Today implements Weather{
    String type = "sunny";
    @Override
    public String getWeatherType() {
        return type;
    }
}
