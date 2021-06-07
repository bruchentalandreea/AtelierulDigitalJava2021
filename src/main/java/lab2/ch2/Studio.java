package lab2.ch2;

public class Studio {
    private String nume;
    private Film[] film;

    public Studio(String nume, Film[] film) {
        this.nume = nume;
        this.film = film;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilm() {
        return film;
    }

    public void setFilm(Film[] film) {
        this.film = film;
    }

    public boolean publishedMoreThanTwo(){
        return film.length > 2;
    }

    public boolean hasCertainActor(String actorName){
        for(int i=0;i<film.length;i++){
            if(film[i].hasActorWithName(actorName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nume;
    }

}
