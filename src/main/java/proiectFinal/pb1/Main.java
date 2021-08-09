package proiectFinal.pb1;

public class Main {
    public static void main(String[] args){

        CitySubject city=new CitySubject ();
        CityObserver cityObserver=new CityObserver(city);
        city.setDescriere("Oras frumos");
        city.setNume("Aiud");

        CityObserver cityObserver1=new CityObserver(city);
        city.setDescriere("Oras mare");
        city.setNume("Brasov");
    }
}
