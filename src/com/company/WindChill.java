package com.company;

public class WindChill implements Observer {

    private double tempState=0;
    private double windState=0;

    @Override
    public void update(Event e) {
        if(e.getType()==EventType.temperature ){
                tempState=e.getTemperature();
                System.out.println("Temperatura odczuwalna: "+(tempState-((windState/100)*5)));
        }
        if(e.getType()==EventType.wind){
            windState=e.getWindSpeed();
            System.out.println("XD");
        }
    }
}
