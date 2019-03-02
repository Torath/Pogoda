package com.company;

import java.util.LinkedList;

public class TemperatureAverage implements Observer{

    private LinkedList<Double> temperatures=new LinkedList<>();
    private double averageTemperature;


    @Override
    public void update(Event e) {
        if(e.getType()==EventType.temperature){
            temperatures.add(e.getTemperature());
            if(temperatures.size()>5)
                temperatures.removeFirst();

            averageTemperature=0;
            for(int i=0;i<temperatures.size();i++){
                averageTemperature+=temperatures.get(i);
            }
            averageTemperature=Math.round(averageTemperature/temperatures.size()*10)/10.0;

            System.out.println("Srednia temperatura to :"+averageTemperature);
        }

    }
}
