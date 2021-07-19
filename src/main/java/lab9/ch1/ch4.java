package lab9.ch1;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ch4 {

    // TODO Capitalize the user username, firstname and lastname
    public static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(u -> new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(),
                u.getLastname().toUpperCase()));
    }

    // TODO Capitalize the users username, firstName and lastName
    public static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map(u -> new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(),
                u.getLastname().toUpperCase()));
    }

    // TODO Capitalize the users username, firstName and lastName using asyncCapitalizeUser
    public static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMap(user -> asyncCapitalizeUser(user));
    }

    public static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(),
                u.getLastname().toUpperCase()));

    }

}
