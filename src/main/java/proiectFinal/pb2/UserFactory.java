package proiectFinal.pb2;

public class UserFactory {

    /**
     *Creeaza un obiect nou in functie de tip
     * @return un obiect nou de tip Admin,RegularUser sau Editor
     */
    public static User createUser(int Id,UserType type,String Username, String FirstName, String LastName,
                                  String DateJoined, String Status,String email)
    {
        User newUser=null;
        switch(type){
            case Admin:
                newUser = new Admin();
                break;
            case RegularUser:
                newUser = new RegularUser();
                break;
            case Editor:
                newUser = new Editor();
                break;
        }

        return newUser;
    }

    /**
     * Folosim metoda getUser pentru a lua User-ul de acel tip
     **/
    public User getUser(String userType){
        if(userType == null){
            return null;
        }
        if(userType.equalsIgnoreCase("ADMIN")){
            return new Admin();

        } else if(userType.equalsIgnoreCase("EDITOR")){
            return new Editor();

        } else if(userType.equalsIgnoreCase("REGULAR USER")){
            return new RegularUser();
        }

        return null;
    }
}
