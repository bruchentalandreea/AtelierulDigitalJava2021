package lab9.ch1;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class ch1 {

    // TODO Return an empty Flux
    public static Flux<String> emptyFlux() {
        return Flux.empty();
    }

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    public static Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    public static Flux<String> fooBarFluxFromList() {
        return Flux.fromIterable(Arrays.asList("foo", "bar"));
    }

    // TODO Create a Flux that emits an IllegalStateException
    public static Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    public static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }

    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        fooBarFluxFromList().subscribe(System.out::println);
        fooBarFluxFromValues().subscribe(System.out::println);
        errorFlux().subscribe(System.out::println);
        counter().subscribe(System.out::println);

    }
}
