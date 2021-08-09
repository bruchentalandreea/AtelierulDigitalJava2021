package proiectFinal.pb1;

import java.util.ArrayList;

public class CitySubject  implements Subject{

    private Integer  id;
    private String nume;
    private String descriere;
    private ArrayList<Observer> observers;
    private int observerId;

    public CitySubject()
    {
        observers = new ArrayList<Observer>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
        notifyObserver();
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
        notifyObserver();
    }


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    /**
     * @param deleteObserver Este observarul care trebuie sters,in prima linie i se ia indexul
     * In a 2-a linie trebuie incrementat index-ul pentru a se potrivi
     * In final sa da remove la observer din ArrayList
     **/
    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);

    }

    /**
     * Se duce prin toti observarii si ii anunta de schimbari
     **/
    @Override
    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(nume, descriere);
        }
    }

    public int getObserverId() {
        return observerId;
    }

    public void setObserverId(int observerId) {
        this.observerId = observerId;
    }
}