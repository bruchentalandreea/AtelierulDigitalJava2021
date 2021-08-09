package proiectFinal.pb2;

import proiectFinal.pb1.CityObserver;
import proiectFinal.pb1.CitySubject;

public class Main {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();

        User user1 = userFactory.getUser("ADMIN");
        user1.type();

        User user2= userFactory.getUser("EDITOR");
        user2.type();

        User user3 = userFactory.getUser("REGULAR USER");
        user3.type();

    }
}
