package lab9.ch1;

import reactor.core.publisher.Mono;

public class ch2 {

    // TODO Return an empty Mono
    public static Mono<String> emptyMono() {
        return Mono.empty();
    }

    // TODO Return a Mono that never emits any signal
    public static Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    // TODO Return a Mono that contains a "foo" value
    public static Mono<String> fooMono() {
        return Mono.just("foo");
    }

    // TODO Create a Mono that emits an IllegalStateException
    public static Mono<String> errorMono() {
        return Mono.error(new IllegalStateException("a Mono that emits an IllegalStateException"));
    }


}
