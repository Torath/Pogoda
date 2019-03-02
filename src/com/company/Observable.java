package com.company;

public interface Observable {
    public void addObservator(Observer o);
    public void deleteObservator(Observer o);
    public void notifyObservator();
}
