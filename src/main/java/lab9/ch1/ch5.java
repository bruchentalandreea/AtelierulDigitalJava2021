package lab9.ch1;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class ch5 {

    private static List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    private static List<String> words2 = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    // TODO Merge flux1 and flux2 values with interleave
// An interesting thing to note is that, opposed to concat (lazy subscription), the sources are subscribed eagerly.
    public static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.merge(flux1, flux2);
    }

    // TODO Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    public static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.mergeSequential(flux1, flux2);
    }

    // TODO Create a Flux containing the value of mono1 then the value of mono2
    public static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }


}
