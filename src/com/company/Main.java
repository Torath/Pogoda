package com.company;

public class Main {

    public static void main(String[] args) {
	 TemperatureAverage t=new TemperatureAverage();
	 Temperature temp=new Temperature();
        temp.addObservator(t);
	 //Thread t1=new Thread(temp);
		Wind wind=new Wind();


		WindChill wChill=new WindChill();
		wind.addObservator(wChill);
		temp.addObservator(wChill);

		Thread t1=new Thread(temp);
		Thread t2=new Thread(wind);
		t1.start();
		t2.start();
    }
}


//    Napisz trzy wersje aplikacji, w której:
//
//        - obiekt klasy Temperature będzie co sekundę tworzył zdarzenia
// TemperatureChange z losową temperaturą w zakresie [-30:30] w st. C.
//
//        - obiekt klasy Wind będzie co sekundę tworzył zdarzenia WindChange
// z losową prędkością wiatru w zakresie [0:99] w km/h.
//
//        Obserwatorami będą obiekty klas :
//
//        - TemperatureAverage będzie nasłuchiwał zdarzeń o temperaturze i zapisywał
// w logach średnią ostatnich 5 pomiarów (lub mniej, jeśli będzie ich mniej)
//
//        - WindChill będzie nasłuchiwał zdarzeń o temperaturze i wietrze.
// Loguje on temperaturę odczuwalną, zatem jeśli jest wiatr, odejmie on
// od zmierzonej temperatury spodziewaną zmianę. Zakładamy, że różnicą będzie
// (ostatnia zanotowana siła wiatru/100) * 5 st. C.
//
//        Jedna wersja powinna oprzeć się na wzorcu Obserwator,
// druga wprowadzić klasę Event Brokera, a trzecia (zamiast Event Brokera) Event Busa.