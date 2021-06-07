package lab2.ch2;



public class Main {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri",35,new  Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000",55,new  Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018",23,new  Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33,new  Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60,new  Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03",20,new  Premiu[]{});

        Actor a1 = new Actor("Jennifer",35, new Premiu[]{new Premiu("Oscar",2020)});
        Actor a2 = new Actor("Tom",35, null);

        Film f1 = new Film(2020,"Film de Oscar", new Actor[]{a1,a2});
        Film f2 = new Film(2021,"Film simplu", new Actor[]{a1});

        Studio s1 = new Studio("Creative", new Film[]{f1,f2,f1,f2,f1});
        Studio s2 = new Studio("First studio", new Film[]{f1,f2});

        Studio[] studios = new Studio[]{s1,s2};

        Film film1= new Film(1990,"film cu actori de oscar", new Actor[]{actorOscar1990,actorFaraPremii01});
        for(int i=0;i<studios.length;i++){
            if(studios[i].publishedMoreThanTwo()){
                System.out.println(studios[i]);
            }
        }
    }
}
