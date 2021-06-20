package observer;

import java.util.ArrayList;
import java.util.List;

//news paper agencies
public class Subject {
    //List don't have limit but Array have limit
    List<Observer> observers = new ArrayList<>();
    //subscribe
    public void subscribe(Observer observer)
    {

        observers.add(observer);
    }
    //unsubscribe
    void Unsubscribe(Observer observer)
    {

        observers.remove(observer);
    }
    //when a new available
     void notifyObserver(String movie, String moive_type)
     {
         //type iter shorcut for foreach
         for (Observer observer : observers) {
             observer.notifyObserver(movie, moive_type);
         }
     }


}
