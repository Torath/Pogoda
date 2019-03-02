package com.company;

import java.util.ArrayList;

public class Temperature implements Observable,Runnable{

    private double state;
    private ArrayList<Observer> observators=new ArrayList<Observer>();

    @Override
    public void addObservator(Observer o) {
        observators.add(o);
    }

    @Override
    public void deleteObservator(Observer o) {
        observators.remove(o);
    }

    @Override
    public void notifyObservator() {
        Event e=new Event(EventType.temperature,state);
        for(Observer o: observators){
            o.update(e);
        }
    }


    @Override
    public void run() {
        while(true){
            state=-30.0 + (double)(Math.random()*30.0);
            state=Math.round(state*10.0)/10.0;
            System.out.println("//wylosowano temperaturę: "+state);
            notifyObservator();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
