package lab2.ch2;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    public boolean hasActorAbove50(){
        boolean toReturn = false;

        for(int i=0; i< actori.length;i++){
            if(actori[i].getVarsta()>50){
                toReturn = true;
            }
        }
        return toReturn;
    }

    public boolean hasActorWithName(String nume){
        for(int i=0;i<actori.length;i++){
            if(actori[i].getNume().equals(nume)){
                return true;
            }
        }
        return false;
    }
}
