package com.company;

enum EventType{
    temperature,
    wind
}

public class Event {

    private EventType type;
    private double temperature;
    private double windSpeed;

    public Event(EventType type, double temperature) {
        this.type = type;
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(int t){
        temperature=t;
    }

    public EventType getType() {
        return type;
    }

    public double getWindSpeed() {
        return windSpeed;
    }
}
